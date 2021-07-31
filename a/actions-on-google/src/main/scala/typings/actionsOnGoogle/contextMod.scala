package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typings.actionsOnGoogle.v1Mod.DialogflowV1Context
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow/context", "ContextValues")
  @js.native
  /** @hidden */
  class ContextValues[TContexts /* <: Contexts */] () extends StObject {
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
    def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
    def this(outputContexts: Unit, _session: String) = this()
    
    /** @hidden */
    def _serialize(): js.Array[GoogleCloudDialogflowV2Context] = js.native
    
    /** @hidden */
    def _serializeV1(): js.Array[DialogflowV1Context] = js.native
    
    var _session: js.Any = js.native
    
    /** @public */
    def delete(name: String): Unit = js.native
    
    /**
      * Returns the incoming context by name for this intent.
      *
      * @example
      * ```javascript
      *
      * const AppContexts = {
      *   NUMBER: 'number',
      * }
      *
      * const app = dialogflow()
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.contexts.set(AppContexts.NUMBER, 1)
      *   conv.ask('Welcome to action snippets! Say a number.')
      * })
      *
      * // Create intent with 'number' context as requirement
      * app.intent('Number Input', conv => {
      *   const context = conv.contexts.get(AppContexts.NUMBER)
      * })
      * ```
      *
      * @param name The name of the Context to retrieve.
      * @return Context value matching name or undefined if no matching context.
      * @public
      */
    def get(name: /* keyof TContexts */ String): /* import warning: importer.ImportType#apply Failed type conversion: TContexts[keyof TContexts] */ js.Any = js.native
    
    /** @public */
    var input: TContexts = js.native
    
    /**
      * Returns the incoming contexts for this intent as an iterator.
      *
      * @example
      * ```javascript
      *
      * const AppContexts = {
      *   NUMBER: 'number',
      * }
      *
      * const app = dialogflow()
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.contexts.set(AppContexts.NUMBER, 1)
      *   conv.ask('Welcome to action snippets! Say a number.')
      * })
      *
      * // Create intent with 'number' context as requirement
      * app.intent('Number Input', conv => {
      *   for (const context of conv.contexts) {
      *     // do something with the contexts
      *   }
      * })
      * ```
      *
      * @public
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Context[Parameters]]] = js.native
    
    /** @public */
    var output: OutputContexts = js.native
    
    /**
      * Set a new context for the current intent.
      *
      * @example
      * ```javascript
      *
      * const AppContexts = {
      *   NUMBER: 'number',
      * }
      *
      * const app = dialogflow()
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.contexts.set(AppContexts.NUMBER, 1)
      *   conv.ask('Welcome to action snippets! Say a number.')
      * })
      *
      * // Create intent with 'number' context as requirement
      * app.intent('Number Input', conv => {
      *   const context = conv.contexts.get(AppContexts.NUMBER)
      * })
      * ```
      *
      * @param name Name of the context. Dialogflow converts to lowercase.
      * @param lifespan Context lifespan.
      * @param parameters Context parameters.
      * @public
      */
    def set(name: String, lifespan: Double): Unit = js.native
    def set(name: String, lifespan: Double, parameters: Parameters): Unit = js.native
  }
  
  trait Context[TParameters /* <: Parameters */]
    extends StObject
       with OutputContext[TParameters] {
    
    /**
      * Full name of the context.
      * @public
      */
    var name: String
    
    /**
      * The context parameters from the current intent.
      * Context parameters include parameters collected in previous intents
      * during the lifespan of the given context.
      *
      * See {@link https://dialogflow.com/docs/concept-actions#section-extracting-values-from-contexts|
      *     here}.
      *
      * @example
      * ```javascript
      *
      * app.intent('Tell Greeting', conv => {
      *   const context1 = conv.contexts.get('context1')
      *   const parameters = context1.parameters
      *   const color = parameters.color
      *   const num = parameters.num
      * })
      *
      * // Using destructuring
      * app.intent('Tell Greeting', conv => {
      *   const context1 = conv.contexts.get('context1')
      *   const { color, num } = context1.parameters
      * })
      * ```
      *
      * @public
      */
    @JSName("parameters")
    var parameters_Context: TParameters
  }
  object Context {
    
    @scala.inline
    def apply[TParameters /* <: Parameters */](lifespan: Double, name: String, parameters: TParameters): Context[TParameters] = {
      val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[TParameters]]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context[?], TParameters /* <: Parameters */] (val x: Self & Context[TParameters]) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: TParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  type Contexts = /** @public */
  StringDictionary[js.UndefOr[Context[Parameters]]]
  
  trait OutputContext[TParameters /* <: Parameters */] extends StObject {
    
    /** @public */
    var lifespan: Double
    
    /** @public */
    var parameters: js.UndefOr[TParameters] = js.undefined
  }
  object OutputContext {
    
    @scala.inline
    def apply[TParameters /* <: Parameters */](lifespan: Double): OutputContext[TParameters] = {
      val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputContext[TParameters]]
    }
    
    @scala.inline
    implicit class OutputContextMutableBuilder[Self <: OutputContext[?], TParameters /* <: Parameters */] (val x: Self & OutputContext[TParameters]) extends AnyVal {
      
      @scala.inline
      def setLifespan(value: Double): Self = StObject.set(x, "lifespan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: TParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  type OutputContexts = /** @public */
  StringDictionary[js.UndefOr[OutputContext[Parameters]]]
  
  type Parameters = /** @public */
  StringDictionary[js.UndefOr[String | js.Object]]
}
