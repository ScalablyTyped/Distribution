package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threat extends StObject {
  
  /**
    * Provides information about the file paths that were affected by the threat. 
    */
  var FilePaths: js.UndefOr[FilePathList] = js.undefined
  
  /**
    * This total number of items in which the threat has been detected. 
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the threat. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The severity of the threat. 
    */
  var Severity: js.UndefOr[NonEmptyString] = js.undefined
}
object Threat {
  
  inline def apply(): Threat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threat]
  }
  
  extension [Self <: Threat](x: Self) {
    
    inline def setFilePaths(value: FilePathList): Self = StObject.set(x, "FilePaths", value.asInstanceOf[js.Any])
    
    inline def setFilePathsUndefined: Self = StObject.set(x, "FilePaths", js.undefined)
    
    inline def setFilePathsVarargs(value: FilePaths*): Self = StObject.set(x, "FilePaths", js.Array(value*))
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSeverity(value: NonEmptyString): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
  }
}
