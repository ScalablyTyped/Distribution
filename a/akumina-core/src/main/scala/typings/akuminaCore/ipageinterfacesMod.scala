package typings.akuminaCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipageinterfacesMod {
  
  trait IPageVersion
    extends StObject
       with IPageVersionProperties {
    
    var pageWidgets: js.Array[Any]
  }
  object IPageVersion {
    
    inline def apply(
      isActive: Boolean,
      pageId: String,
      pageVersionDescription: String,
      pageVersionId: String,
      pageVersionName: String,
      pageVersionPriorityGroup: String,
      pageWidgets: js.Array[Any]
    ): IPageVersion = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], pageVersionDescription = pageVersionDescription.asInstanceOf[js.Any], pageVersionId = pageVersionId.asInstanceOf[js.Any], pageVersionName = pageVersionName.asInstanceOf[js.Any], pageVersionPriorityGroup = pageVersionPriorityGroup.asInstanceOf[js.Any], pageWidgets = pageWidgets.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageVersion]
    }
    
    extension [Self <: IPageVersion](x: Self) {
      
      inline def setPageWidgets(value: js.Array[Any]): Self = StObject.set(x, "pageWidgets", value.asInstanceOf[js.Any])
      
      inline def setPageWidgetsVarargs(value: Any*): Self = StObject.set(x, "pageWidgets", js.Array(value*))
    }
  }
  
  trait IPageVersionPriorityGroup extends StObject {
    
    var pageVersionId: String
    
    var pageVersionPriorityGroup: String
  }
  object IPageVersionPriorityGroup {
    
    inline def apply(pageVersionId: String, pageVersionPriorityGroup: String): IPageVersionPriorityGroup = {
      val __obj = js.Dynamic.literal(pageVersionId = pageVersionId.asInstanceOf[js.Any], pageVersionPriorityGroup = pageVersionPriorityGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageVersionPriorityGroup]
    }
    
    extension [Self <: IPageVersionPriorityGroup](x: Self) {
      
      inline def setPageVersionId(value: String): Self = StObject.set(x, "pageVersionId", value.asInstanceOf[js.Any])
      
      inline def setPageVersionPriorityGroup(value: String): Self = StObject.set(x, "pageVersionPriorityGroup", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPageVersionProperties extends StObject {
    
    var isActive: Boolean
    
    var pageId: String
    
    var pageVersionDescription: String
    
    var pageVersionId: String
    
    var pageVersionName: String
    
    var pageVersionPriorityGroup: String
  }
  object IPageVersionProperties {
    
    inline def apply(
      isActive: Boolean,
      pageId: String,
      pageVersionDescription: String,
      pageVersionId: String,
      pageVersionName: String,
      pageVersionPriorityGroup: String
    ): IPageVersionProperties = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], pageVersionDescription = pageVersionDescription.asInstanceOf[js.Any], pageVersionId = pageVersionId.asInstanceOf[js.Any], pageVersionName = pageVersionName.asInstanceOf[js.Any], pageVersionPriorityGroup = pageVersionPriorityGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageVersionProperties]
    }
    
    extension [Self <: IPageVersionProperties](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      inline def setPageVersionDescription(value: String): Self = StObject.set(x, "pageVersionDescription", value.asInstanceOf[js.Any])
      
      inline def setPageVersionId(value: String): Self = StObject.set(x, "pageVersionId", value.asInstanceOf[js.Any])
      
      inline def setPageVersionName(value: String): Self = StObject.set(x, "pageVersionName", value.asInstanceOf[js.Any])
      
      inline def setPageVersionPriorityGroup(value: String): Self = StObject.set(x, "pageVersionPriorityGroup", value.asInstanceOf[js.Any])
    }
  }
}
