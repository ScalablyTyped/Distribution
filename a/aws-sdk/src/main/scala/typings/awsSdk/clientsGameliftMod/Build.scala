package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift build resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::build/build-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. In a GameLift build ARN, the resource ID matches the BuildId value.
    */
  var BuildArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.BuildArn] = js.undefined
  
  /**
    * A unique identifier for the build.
    */
  var BuildId: js.UndefOr[typings.awsSdk.clientsGameliftMod.BuildId] = js.undefined
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A descriptive label that is associated with a build. Build names do not need to be unique. It can be set using CreateBuild or UpdateBuild.
    */
  var Name: js.UndefOr[FreeText] = js.undefined
  
  /**
    * Operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsGameliftMod.OperatingSystem] = js.undefined
  
  /**
    * File size of the uploaded game build, expressed in bytes. When the build status is INITIALIZED or when using a custom Amazon S3 storage location, this value is 0.
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined
  
  /**
    * Current status of the build. Possible build statuses include the following:    INITIALIZED -- A new build has been defined, but no files have been uploaded. You cannot create fleets for builds that are in this status. When a build is successfully created, the build status is set to this value.     READY -- The game build has been successfully uploaded. You can now create new fleets for this build.    FAILED -- The game build upload failed. You cannot create new fleets for this build.   
    */
  var Status: js.UndefOr[BuildStatus] = js.undefined
  
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique. This value can be set using CreateBuild or UpdateBuild.
    */
  var Version: js.UndefOr[FreeText] = js.undefined
}
object Build {
  
  inline def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setBuildArn(value: BuildArn): Self = StObject.set(x, "BuildArn", value.asInstanceOf[js.Any])
    
    inline def setBuildArnUndefined: Self = StObject.set(x, "BuildArn", js.undefined)
    
    inline def setBuildId(value: BuildId): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "BuildId", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setName(value: FreeText): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setSizeOnDisk(value: PositiveLong): Self = StObject.set(x, "SizeOnDisk", value.asInstanceOf[js.Any])
    
    inline def setSizeOnDiskUndefined: Self = StObject.set(x, "SizeOnDisk", js.undefined)
    
    inline def setStatus(value: BuildStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersion(value: FreeText): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
