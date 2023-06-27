package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ButtonMenu
import typings.arcgisJsApi.esri.ButtonMenuItemConfig
import typings.arcgisJsApi.esri.GroupColumn
import typings.arcgisJsApi.esri.GroupColumnProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTableGridGroupColumnMod {
  
  @JSImport("esri/widgets/FeatureTable/Grid/GroupColumn", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GroupColumn {
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
}
