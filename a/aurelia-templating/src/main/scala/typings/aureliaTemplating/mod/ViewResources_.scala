package typings.aureliaTemplating.mod

import typings.aureliaBinding.mod.BindingBehaviorResource
import typings.aureliaBinding.mod.ValueConverterResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewResources")
@js.native
/**
  * Creates an instance of ViewResources.
  * @param parent The parent resources. This resources can override them, but if a resource is not found, it will be looked up in the parent.
  * @param viewUrl The url of the view to which these resources apply.
  */
class ViewResources_ () extends StObject {
  def this(parent: ViewResources_) = this()
  def this(parent: Unit, viewUrl: String) = this()
  def this(parent: ViewResources_, viewUrl: String) = this()
  
  /**
    * @internal
    * Not supported for public use. Can be changed without warning.
    *
    * Auto register a resources based on its metadata or convention
    * Will fallback to custom element if no metadata found and all conventions fail
    * @param {Container} container
    * @param {Function} impl
    * @returns {HtmlBehaviorResource | ValueConverterResource | BindingBehaviorResource | ViewEngineHooksResource}
    */
  def autoRegister(): js.Any = js.native
  def autoRegister(container: js.Any): js.Any = js.native
  def autoRegister(container: js.Any, impl: js.Any): js.Any = js.native
  def autoRegister(container: Unit, impl: js.Any): js.Any = js.native
  
  /**
    * A custom binding language used in the view.
    */
  var bindingLanguage: js.Any = js.native
  
  /**
    * Gets an HTML attribute behavior.
    * @param attribute The name of the attribute to lookup.
    * @return The HtmlBehaviorResource for the attribute or null.
    */
  def getAttribute(attribute: String): HtmlBehaviorResource = js.native
  
  /**
    * Gets a binding behavior.
    * @param name The name of the binding behavior.
    * @return The binding behavior instance.
    */
  def getBindingBehavior(name: String): js.Object = js.native
  
  /**
    * Gets the binding language associated with these resources, or return the provided fallback implementation.
    * @param bindingLanguageFallback The fallback binding language implementation to use if no binding language is configured locally.
    * @return The binding language.
    */
  def getBindingLanguage(bindingLanguageFallback: BindingLanguage): BindingLanguage = js.native
  
  /**
    * Gets an HTML element behavior.
    * @param tagName The tag name to search for.
    * @return The HtmlBehaviorResource for the tag name or null.
    */
  def getElement(tagName: String): HtmlBehaviorResource = js.native
  
  /**
    * Gets a value.
    * @param name The name of the value.
    * @return The value.
    */
  def getValue(name: String): js.Any = js.native
  
  /**
    * Gets a value converter.
    * @param name The name of the value converter.
    * @return The value converter instance.
    */
  def getValueConverter(name: String): js.Object = js.native
  
  /**
    * Gets the known attribute name based on the local attribute name.
    * @param attribute The local attribute name to lookup.
    * @return The known name.
    */
  def mapAttribute(attribute: String): String = js.native
  
  /**
    * Patches an immediate parent into the view resource resolution hierarchy.
    * @param newParent The new parent resources to patch in.
    */
  def patchInParent(newParent: ViewResources_): Unit = js.native
  
  /**
    * Registers an HTML attribute.
    * @param attribute The name of the attribute.
    * @param behavior The behavior of the attribute.
    * @param knownAttribute The well-known name of the attribute (in lieu of the local name).
    */
  def registerAttribute(attribute: String, behavior: HtmlBehaviorResource, knownAttribute: String): Unit = js.native
  
  /**
    * Registers a binding behavior.
    * @param name The name of the binding behavior.
    * @param bindingBehavior The binding behavior instance.
    */
  def registerBindingBehavior(name: String, bindingBehavior: js.Object): Unit = js.native
  
  /**
    * Registers an HTML element.
    * @param tagName The name of the custom element.
    * @param behavior The behavior of the element.
    */
  def registerElement(tagName: String, behavior: HtmlBehaviorResource): Unit = js.native
  
  /**
    * Registers a value.
    * @param name The name of the value.
    * @param value The value.
    */
  def registerValue(name: String, value: js.Any): Unit = js.native
  
  /**
    * Registers a value converter.
    * @param name The name of the value converter.
    * @param valueConverter The value converter instance.
    */
  def registerValueConverter(name: String, valueConverter: js.Object): Unit = js.native
  
  /**
    * Registers view engine hooks for the view.
    * @param hooks The hooks to register.
    */
  def registerViewEngineHooks(hooks: ViewEngineHooks_): Unit = js.native
  
  /**
    * Maps a path relative to the associated view's origin.
    * @param path The relative path.
    * @return The calcualted path.
    */
  def relativeToView(path: String): String = js.native
}
/* static members */
object ViewResources_ {
  
  @JSImport("aurelia-templating", "ViewResources")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks whether the provided class contains any resource conventions
    * @param target Target class to extract metadata based on convention
    * @param existing If supplied, all custom element / attribute metadata extracted from convention will be apply to this instance
    */
  @scala.inline
  def convention(target: js.Function): HtmlBehaviorResource | ValueConverterResource | BindingBehaviorResource | ViewEngineHooksResource = ^.asInstanceOf[js.Dynamic].applyDynamic("convention")(target.asInstanceOf[js.Any]).asInstanceOf[HtmlBehaviorResource | ValueConverterResource | BindingBehaviorResource | ViewEngineHooksResource]
  @scala.inline
  def convention(target: js.Function, existing: HtmlBehaviorResource): HtmlBehaviorResource | ValueConverterResource | BindingBehaviorResource | ViewEngineHooksResource = (^.asInstanceOf[js.Dynamic].applyDynamic("convention")(target.asInstanceOf[js.Any], existing.asInstanceOf[js.Any])).asInstanceOf[HtmlBehaviorResource | ValueConverterResource | BindingBehaviorResource | ViewEngineHooksResource]
}
