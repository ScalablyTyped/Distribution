package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ButtonMenu
import typings.arcgisJsApi.esri.ButtonMenuItemConfig
import typings.arcgisJsApi.esri.FieldColumn
import typings.arcgisJsApi.esri.FieldColumnConstructor
import typings.arcgisJsApi.esri.FieldColumnProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldColumnMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/FieldColumn", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldColumnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/FieldColumn", JSImport.Namespace)
  @js.native
  /**
    * The [FieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) class works with the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) and provides the underlying logic for column behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html)
    */
  class Class ()
    extends StObject
       with FieldColumn {
    def this(properties: FieldColumnProperties) = this()
    
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
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#resizable)
      */
    /* CompleteClass */
    override val resizable: Boolean = js.native
  }
  
  type _To = js.Object & FieldColumnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldColumnMod.foo` */
  override def _to: js.Object & FieldColumnConstructor = ^
}
