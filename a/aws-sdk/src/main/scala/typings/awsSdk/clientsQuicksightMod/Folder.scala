package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the folder.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The time that the folder was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the folder.
    */
  var FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * An array of ancestor ARN strings for the folder.
    */
  var FolderPath: js.UndefOr[Path] = js.undefined
  
  /**
    * The type of folder it is.
    */
  var FolderType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FolderType] = js.undefined
  
  /**
    * The time that the folder was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A display name for the folder.
    */
  var Name: js.UndefOr[FolderName] = js.undefined
}
object Folder {
  
  inline def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  extension [Self <: Folder](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setFolderId(value: RestrictiveResourceId): Self = StObject.set(x, "FolderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "FolderId", js.undefined)
    
    inline def setFolderPath(value: Path): Self = StObject.set(x, "FolderPath", value.asInstanceOf[js.Any])
    
    inline def setFolderPathUndefined: Self = StObject.set(x, "FolderPath", js.undefined)
    
    inline def setFolderPathVarargs(value: Arn*): Self = StObject.set(x, "FolderPath", js.Array(value*))
    
    inline def setFolderType(value: FolderType): Self = StObject.set(x, "FolderType", value.asInstanceOf[js.Any])
    
    inline def setFolderTypeUndefined: Self = StObject.set(x, "FolderType", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
