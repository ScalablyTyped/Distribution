package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMediaStorageConfigurationOutput extends StObject {
  
  /**
    * A structure that encapsulates, or contains, the media storage configuration properties.
    */
  var MediaStorageConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.MediaStorageConfiguration] = js.undefined
}
object DescribeMediaStorageConfigurationOutput {
  
  inline def apply(): DescribeMediaStorageConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMediaStorageConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMediaStorageConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setMediaStorageConfiguration(value: MediaStorageConfiguration): Self = StObject.set(x, "MediaStorageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMediaStorageConfigurationUndefined: Self = StObject.set(x, "MediaStorageConfiguration", js.undefined)
  }
}
