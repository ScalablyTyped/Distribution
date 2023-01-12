package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  /**
    * The checksum information of the model.
    */
  var Checksum: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.Checksum] = js.undefined
  
  /**
    * The unique model handle.
    */
  var ModelHandle: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The absolute S3 location of the model.
    */
  var S3Url: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The desired state of the model.
    */
  var State: js.UndefOr[ModelState] = js.undefined
}
object Definition {
  
  inline def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: Checksum): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
    
    inline def setModelHandle(value: EntityName): Self = StObject.set(x, "ModelHandle", value.asInstanceOf[js.Any])
    
    inline def setModelHandleUndefined: Self = StObject.set(x, "ModelHandle", js.undefined)
    
    inline def setS3Url(value: S3Uri): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
    
    inline def setS3UrlUndefined: Self = StObject.set(x, "S3Url", js.undefined)
    
    inline def setState(value: ModelState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
