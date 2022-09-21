package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.HTMLMetaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "Meta")
@js.native
open class Meta protected () extends StObject {
  def this(_doc: Any) = this()
  
  /* private */ var _containsAttributes: Any = js.native
  
  /* private */ var _doc: Any = js.native
  
  /* private */ var _dom: Any = js.native
  
  /* private */ var _getMetaKeyMap: Any = js.native
  
  /* private */ var _getOrCreateElement: Any = js.native
  
  /* private */ var _parseSelector: Any = js.native
  
  /* private */ var _setMetaElementAttributes: Any = js.native
  
  /**
    * Retrieves or creates a specific `<meta>` tag element in the current HTML document.
    * In searching for an existing tag, Angular attempts to match the `name` or `property` attribute
    * values in the provided tag definition, and verifies that all other attribute values are equal.
    * If an existing element is found, it is returned and is not modified in any way.
    * @param tag The definition of a `<meta>` element to match or create.
    * @param forceCreation True to create a new element without checking whether one already exists.
    * @returns The existing element with the same attributes and values if found,
    * the new element if no match is found, or `null` if the tag parameter is not defined.
    */
  def addTag(tag: MetaDefinition): HTMLMetaElement | Null = js.native
  def addTag(tag: MetaDefinition, forceCreation: Boolean): HTMLMetaElement | Null = js.native
  
  /**
    * Retrieves or creates a set of `<meta>` tag elements in the current HTML document.
    * In searching for an existing tag, Angular attempts to match the `name` or `property` attribute
    * values in the provided tag definition, and verifies that all other attribute values are equal.
    * @param tags An array of tag definitions to match or create.
    * @param forceCreation True to create new elements without checking whether they already exist.
    * @returns The matching elements if found, or the new elements.
    */
  def addTags(tags: js.Array[MetaDefinition]): js.Array[HTMLMetaElement] = js.native
  def addTags(tags: js.Array[MetaDefinition], forceCreation: Boolean): js.Array[HTMLMetaElement] = js.native
  
  /**
    * Retrieves a `<meta>` tag element in the current HTML document.
    * @param attrSelector The tag attribute and value to match against, in the format
    * `"tag_attribute='value string'"`.
    * @returns The matching element, if any.
    */
  def getTag(attrSelector: String): HTMLMetaElement | Null = js.native
  
  /**
    * Retrieves a set of `<meta>` tag elements in the current HTML document.
    * @param attrSelector The tag attribute and value to match against, in the format
    * `"tag_attribute='value string'"`.
    * @returns The matching elements, if any.
    */
  def getTags(attrSelector: String): js.Array[HTMLMetaElement] = js.native
  
  /**
    * Removes an existing `<meta>` tag element from the current HTML document.
    * @param attrSelector A tag attribute and value to match against, to identify
    * an existing tag. A string in the format `"tag_attribute=`value string`"`.
    */
  def removeTag(attrSelector: String): Unit = js.native
  
  /**
    * Removes an existing `<meta>` tag element from the current HTML document.
    * @param meta The tag definition to match against to identify an existing tag.
    */
  def removeTagElement(meta: HTMLMetaElement): Unit = js.native
  
  /**
    * Modifies an existing `<meta>` tag element in the current HTML document.
    * @param tag The tag description with which to replace the existing tag content.
    * @param selector A tag attribute and value to match against, to identify
    * an existing tag. A string in the format `"tag_attribute=`value string`"`.
    * If not supplied, matches a tag with the same `name` or `property` attribute value as the
    * replacement tag.
    * @return The modified element.
    */
  def updateTag(tag: MetaDefinition): HTMLMetaElement | Null = js.native
  def updateTag(tag: MetaDefinition, selector: String): HTMLMetaElement | Null = js.native
}
/* static members */
object Meta {
  
  @JSImport("@angular/platform-browser", "Meta")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "Meta.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[Meta, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[Meta, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "Meta.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[Meta] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[Meta]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
