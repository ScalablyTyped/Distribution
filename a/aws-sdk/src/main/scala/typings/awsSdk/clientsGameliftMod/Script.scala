package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Script extends StObject {
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A descriptive label that is associated with a script. Script names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift script resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.ScriptArn] = js.undefined
  
  /**
    * A unique identifier for the Realtime script
    */
  var ScriptId: js.UndefOr[typings.awsSdk.clientsGameliftMod.ScriptId] = js.undefined
  
  /**
    * The file size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this value remains at "0".
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined
  
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object Script {
  
  inline def apply(): Script = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Script]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScriptArn(value: ScriptArn): Self = StObject.set(x, "ScriptArn", value.asInstanceOf[js.Any])
    
    inline def setScriptArnUndefined: Self = StObject.set(x, "ScriptArn", js.undefined)
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "ScriptId", js.undefined)
    
    inline def setSizeOnDisk(value: PositiveLong): Self = StObject.set(x, "SizeOnDisk", value.asInstanceOf[js.Any])
    
    inline def setSizeOnDiskUndefined: Self = StObject.set(x, "SizeOnDisk", js.undefined)
    
    inline def setStorageLocation(value: S3Location): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationUndefined: Self = StObject.set(x, "StorageLocation", js.undefined)
    
    inline def setVersion(value: NonZeroAndMaxString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
