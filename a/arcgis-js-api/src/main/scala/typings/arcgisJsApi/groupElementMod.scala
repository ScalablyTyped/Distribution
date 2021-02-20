package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GroupElement
import typings.arcgisJsApi.esri.GroupElementConstructor
import typings.arcgisJsApi.esri.GroupElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupElementMod extends Shortcut {
  
  @JSImport("esri/form/elements/GroupElement", JSImport.Namespace)
  @js.native
  val ^ : GroupElementConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/GroupElement", JSImport.Namespace)
  @js.native
  /**
    * A `GroupElement` form element defines a container that holds a set of [form elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements) that can be expanded, collapsed, or displayed together.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html)
    */
  class Class () extends GroupElement {
    def this(properties: GroupElementProperties) = this()
  }
  
  type _To = GroupElementConstructor
  
  /* This means you don't have to write `^`, but can instead just say `groupElementMod.foo` */
  override def _to: GroupElementConstructor = ^
}
