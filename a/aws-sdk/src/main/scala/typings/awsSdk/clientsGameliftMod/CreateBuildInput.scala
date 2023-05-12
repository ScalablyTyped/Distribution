package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBuildInput extends StObject {
  
  /**
    * A descriptive label associated with a build. Build names don't need to be unique. You can change this value later. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The operating system that you built the game server binaries to run on. This value determines the type of fleet resources that you can use for this build. If your game build contains multiple executables, they all must run on the same operating system. If an operating system isn't specified when creating a build, Amazon GameLift uses the default value (WINDOWS_2012). This value can't be changed later.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsGameliftMod.OperatingSystem] = js.undefined
  
  /**
    * A server SDK version you used when integrating your game server build with Amazon GameLift. For more information see Integrate games with custom game servers. By default Amazon GameLift sets this value to 4.0.2.
    */
  var ServerSdkVersion: js.UndefOr[typings.awsSdk.clientsGameliftMod.ServerSdkVersion] = js.undefined
  
  /**
    * Information indicating where your game build files are stored. Use this parameter only when creating a build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3 bucket. The S3 bucket and your new build must be in the same Region. If a StorageLocation is specified, the size of your file can be found in your Amazon S3 bucket. Amazon GameLift will report a SizeOnDisk of 0. 
    */
  var StorageLocation: js.UndefOr[S3Location] = js.undefined
  
  /**
    * A list of labels to assign to the new build resource. Tags are developer defined key-value pairs. Tagging Amazon Web Services resources are useful for resource management, access management and cost allocation. For more information, see  Tagging Amazon Web Services Resources in the Amazon Web Services General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags. The maximum tag limit may be lower than stated. See the Amazon Web Services General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Version information associated with a build or script. Version strings don't need to be unique. You can change this value later. 
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object CreateBuildInput {
  
  inline def apply(): CreateBuildInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBuildInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBuildInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setServerSdkVersion(value: ServerSdkVersion): Self = StObject.set(x, "ServerSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setServerSdkVersionUndefined: Self = StObject.set(x, "ServerSdkVersion", js.undefined)
    
    inline def setStorageLocation(value: S3Location): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    inline def setStorageLocationUndefined: Self = StObject.set(x, "StorageLocation", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVersion(value: NonZeroAndMaxString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
