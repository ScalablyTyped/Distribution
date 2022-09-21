package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ButtonMenuItemConfig
import typings.arcgisJsApi.esri.GroupColumnProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.GroupColumn")
@js.native
open class GroupColumnCls ()
  extends StObject
     with typings.arcgisJsApi.esri.GroupColumn {
  def this(properties: GroupColumnProperties) = this()
  
  /**
    * Returns any associated menu items on the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#getMenuItems)
    */
  /* CompleteClass */
  override def getMenuItems(): ButtonMenuItemConfig = js.native
  
  /**
    * The object to customize the feature table column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#menu)
    */
  /* CompleteClass */
  override val menu: typings.arcgisJsApi.esri.ButtonMenu = js.native
  
  /**
    * Indicates whether the column is resizable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#resizable)
    */
  /* CompleteClass */
  override val resizable: Boolean = js.native
}
