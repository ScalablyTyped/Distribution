package typings.actionsOnGoogle.contextMod

import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2Context
import typings.actionsOnGoogle.v1Mod.DialogflowV1Context
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/dialogflow/context", "ContextValues")
@js.native
/** @hidden */
class ContextValues[TContexts /* <: Contexts */] () extends js.Object {
  def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context]) = this()
  def this(outputContexts: js.Array[DialogflowV1Context | GoogleCloudDialogflowV2Context], _session: String) = this()
  var _session: js.UndefOr[js.Any] = js.native
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
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Context[Parameters]]] = js.native
  /** @public */
  var output: OutputContexts = js.native
  /** @hidden */
  def _serialize(): js.Array[GoogleCloudDialogflowV2Context] = js.native
  /** @hidden */
  def _serializeV1(): js.Array[DialogflowV1Context] = js.native
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
  def get(name: String): /* import warning: importer.ImportType#apply Failed type conversion: TContexts[keyof TContexts] */ js.Any = js.native
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

