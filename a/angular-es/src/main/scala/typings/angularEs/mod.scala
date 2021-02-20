package typings.angularEs

import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Register component
    *
    * @param component - component config
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Component")
  @js.native
  def Component(component: iComponent): ngESDecorator = js.native
  
  /**
    * Register config block
    */
  @JSImport("angular-es", "Config")
  @js.native
  def Config(): ngESDecorator = js.native
  
  /**
    * Register constant
    *
    * @param name - constant name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Constant")
  @js.native
  def Constant(name: String): ngESDecorator = js.native
  
  /**
    * Register controller
    *
    * @param name - controller name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Controller")
  @js.native
  def Controller(name: String): ngESDecorator = js.native
  
  /**
    * Register decorator
    *
    * @param name - provider name to decorate
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Decorator")
  @js.native
  def Decorator(name: String): ngESDecorator = js.native
  
  /**
    * Register directive
    *
    * @param name - directive selector, can be in hyphen-case
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Directive")
  @js.native
  def Directive(name: String): ngESDecorator = js.native
  
  /**
    * Register factory
    *
    * @param name - factory name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Factory")
  @js.native
  def Factory(name: String): ngESDecorator = js.native
  
  /**
    * Register filter
    *
    * @param name - filter name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Filter")
  @js.native
  def Filter(name: String): ngESDecorator = js.native
  
  /**
    * Add $inject property to target
    *
    * @param dependencies - dependencies to inject
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Inject")
  @js.native
  def Inject(dependencies: String*): ngESDecorator = js.native
  
  /**
    * Inject dependencies as properties to target
    *
    * @param dependencies - dependencies to inject
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "InjectAsProperty")
  @js.native
  def InjectAsProperty(dependencies: String*): ngESDecorator = js.native
  
  /**
    * Attach target to the specified module
    *
    * @param name - module name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Module")
  @js.native
  def Module(name: String): ngESDecorator = js.native
  
  /**
    * Register provider
    *
    * @param name - provider name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Provider")
  @js.native
  def Provider(name: String): ngESDecorator = js.native
  
  /**
    * Register run block
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Run")
  @js.native
  def Run(): ngESDecorator = js.native
  
  /**
    * Register service
    *
    * @param name - service name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Service")
  @js.native
  def Service(name: String): ngESDecorator = js.native
  
  /**
    * Register value
    *
    * @param name - value name
    *
    * @returns decorated class
    */
  @JSImport("angular-es", "Value")
  @js.native
  def Value(name: String): ngESDecorator = js.native
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any] | Unit
  ]
  
  /**
    * Component interface
    * @see https://docs.angularjs.org/guide/component
    */
  @js.native
  trait iComponent extends StObject {
    
    var bindings: js.UndefOr[js.Object] = js.native
    
    var controllerAs: js.UndefOr[String] = js.native
    
    var require: js.UndefOr[String] = js.native
    
    var selector: String = js.native
    
    var template: String = js.native
    
    var templateUrl: js.UndefOr[String] = js.native
    
    var transclude: js.UndefOr[String] = js.native
  }
  object iComponent {
    
    @scala.inline
    def apply(selector: String, template: String): iComponent = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[iComponent]
    }
    
    @scala.inline
    implicit class iComponentMutableBuilder[Self <: iComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Object): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      @scala.inline
      def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      @scala.inline
      def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      @scala.inline
      def setTransclude(value: String): Self = StObject.set(x, "transclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscludeUndefined: Self = StObject.set(x, "transclude", js.undefined)
    }
  }
  
  /**
    * Decorated target
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - js.Function because Already inherited
  - typings.angularEs.mod.MethodDecorator because var conflicts: length. Inlined  */ @js.native
  trait ngESDecorator extends ClassDecorator {
    
    def apply(
      target: js.Function,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(
      target: js.Function,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: String
    ): Unit = js.native
    def apply(
      target: js.Function,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Function, ngName: js.UndefOr[scala.Nothing], ngArguments: js.Array[_]): Unit = js.native
    def apply(
      target: js.Function,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.Array[_],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Function, ngName: js.UndefOr[scala.Nothing], ngArguments: js.Array[_], ngType: String): Unit = js.native
    def apply(
      target: js.Function,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.Array[_],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Function, ngName: String): Unit = js.native
    def apply(
      target: js.Function,
      ngName: String,
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Function, ngName: String, ngArguments: js.UndefOr[scala.Nothing], ngType: String): Unit = js.native
    def apply(
      target: js.Function,
      ngName: String,
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Function, ngName: String, ngArguments: js.Array[_]): Unit = js.native
    def apply(
      target: js.Function,
      ngName: String,
      ngArguments: js.Array[_],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Function, ngName: String, ngArguments: js.Array[_], ngType: String): Unit = js.native
    def apply(
      target: js.Function,
      ngName: String,
      ngArguments: js.Array[_],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object): Unit = js.native
    def apply(
      target: js.Object,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(
      target: js.Object,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: String
    ): Unit = js.native
    def apply(
      target: js.Object,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object, ngName: js.UndefOr[scala.Nothing], ngArguments: js.Array[_]): Unit = js.native
    def apply(
      target: js.Object,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.Array[_],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object, ngName: js.UndefOr[scala.Nothing], ngArguments: js.Array[_], ngType: String): Unit = js.native
    def apply(
      target: js.Object,
      ngName: js.UndefOr[scala.Nothing],
      ngArguments: js.Array[_],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object, ngName: String): Unit = js.native
    def apply(
      target: js.Object,
      ngName: String,
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object, ngName: String, ngArguments: js.UndefOr[scala.Nothing], ngType: String): Unit = js.native
    def apply(
      target: js.Object,
      ngName: String,
      ngArguments: js.UndefOr[scala.Nothing],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object, ngName: String, ngArguments: js.Array[_]): Unit = js.native
    def apply(
      target: js.Object,
      ngName: String,
      ngArguments: js.Array[_],
      ngType: js.UndefOr[scala.Nothing],
      injectAsProperty: js.Array[String]
    ): Unit = js.native
    def apply(target: js.Object, ngName: String, ngArguments: js.Array[_], ngType: String): Unit = js.native
    def apply(
      target: js.Object,
      ngName: String,
      ngArguments: js.Array[_],
      ngType: String,
      injectAsProperty: js.Array[String]
    ): Unit = js.native
  }
}
