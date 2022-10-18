package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ButtonMenu
import typings.arcgisJsApi.esri.ButtonMenuItemConfig
import typings.arcgisJsApi.esri.Column
import typings.arcgisJsApi.esri.ColumnConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTableGridColumnMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/Grid/Column", JSImport.Namespace)
  @js.native
  val ^ : ColumnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/Grid/Column", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Column {
    
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
    override val menu: ButtonMenu = js.native
    
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
  
  type _To = ColumnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsFeatureTableGridColumnMod.foo` */
  override def _to: ColumnConstructor = ^
}
