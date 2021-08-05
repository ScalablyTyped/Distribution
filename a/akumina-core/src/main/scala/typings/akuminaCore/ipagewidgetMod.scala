package typings.akuminaCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipagewidgetMod {
  
  trait IPageWidget extends StObject {
    
    var ContainerId: String
    
    var DisplayOrder: String
    
    var Grid: String
    
    var LayoutId: String
    
    var PageId: String
    
    var Title: String
    
    var VirtualWidgetInstanceId: String
    
    var WidgetDescription: String
    
    var WidgetIcon: String
    
    var WidgetInstanceId: String
    
    var WidgetName: String
    
    var WidgetOptions: String
    
    var WidgetProperties: String
    
    var ZoneId: String
  }
  object IPageWidget {
    
    inline def apply(
      ContainerId: String,
      DisplayOrder: String,
      Grid: String,
      LayoutId: String,
      PageId: String,
      Title: String,
      VirtualWidgetInstanceId: String,
      WidgetDescription: String,
      WidgetIcon: String,
      WidgetInstanceId: String,
      WidgetName: String,
      WidgetOptions: String,
      WidgetProperties: String,
      ZoneId: String
    ): IPageWidget = {
      val __obj = js.Dynamic.literal(ContainerId = ContainerId.asInstanceOf[js.Any], DisplayOrder = DisplayOrder.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any], LayoutId = LayoutId.asInstanceOf[js.Any], PageId = PageId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], VirtualWidgetInstanceId = VirtualWidgetInstanceId.asInstanceOf[js.Any], WidgetDescription = WidgetDescription.asInstanceOf[js.Any], WidgetIcon = WidgetIcon.asInstanceOf[js.Any], WidgetInstanceId = WidgetInstanceId.asInstanceOf[js.Any], WidgetName = WidgetName.asInstanceOf[js.Any], WidgetOptions = WidgetOptions.asInstanceOf[js.Any], WidgetProperties = WidgetProperties.asInstanceOf[js.Any], ZoneId = ZoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageWidget]
    }
    
    extension [Self <: IPageWidget](x: Self) {
      
      inline def setContainerId(value: String): Self = StObject.set(x, "ContainerId", value.asInstanceOf[js.Any])
      
      inline def setDisplayOrder(value: String): Self = StObject.set(x, "DisplayOrder", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: String): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
      
      inline def setLayoutId(value: String): Self = StObject.set(x, "LayoutId", value.asInstanceOf[js.Any])
      
      inline def setPageId(value: String): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setVirtualWidgetInstanceId(value: String): Self = StObject.set(x, "VirtualWidgetInstanceId", value.asInstanceOf[js.Any])
      
      inline def setWidgetDescription(value: String): Self = StObject.set(x, "WidgetDescription", value.asInstanceOf[js.Any])
      
      inline def setWidgetIcon(value: String): Self = StObject.set(x, "WidgetIcon", value.asInstanceOf[js.Any])
      
      inline def setWidgetInstanceId(value: String): Self = StObject.set(x, "WidgetInstanceId", value.asInstanceOf[js.Any])
      
      inline def setWidgetName(value: String): Self = StObject.set(x, "WidgetName", value.asInstanceOf[js.Any])
      
      inline def setWidgetOptions(value: String): Self = StObject.set(x, "WidgetOptions", value.asInstanceOf[js.Any])
      
      inline def setWidgetProperties(value: String): Self = StObject.set(x, "WidgetProperties", value.asInstanceOf[js.Any])
      
      inline def setZoneId(value: String): Self = StObject.set(x, "ZoneId", value.asInstanceOf[js.Any])
    }
  }
}
