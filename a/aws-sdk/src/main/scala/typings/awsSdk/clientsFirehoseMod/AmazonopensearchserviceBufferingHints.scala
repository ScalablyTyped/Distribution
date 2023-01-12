package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonopensearchserviceBufferingHints extends StObject {
  
  var IntervalInSeconds: js.UndefOr[AmazonopensearchserviceBufferingIntervalInSeconds] = js.undefined
  
  var SizeInMBs: js.UndefOr[AmazonopensearchserviceBufferingSizeInMBs] = js.undefined
}
object AmazonopensearchserviceBufferingHints {
  
  inline def apply(): AmazonopensearchserviceBufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonopensearchserviceBufferingHints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonopensearchserviceBufferingHints] (val x: Self) extends AnyVal {
    
    inline def setIntervalInSeconds(value: AmazonopensearchserviceBufferingIntervalInSeconds): Self = StObject.set(x, "IntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalInSecondsUndefined: Self = StObject.set(x, "IntervalInSeconds", js.undefined)
    
    inline def setSizeInMBs(value: AmazonopensearchserviceBufferingSizeInMBs): Self = StObject.set(x, "SizeInMBs", value.asInstanceOf[js.Any])
    
    inline def setSizeInMBsUndefined: Self = StObject.set(x, "SizeInMBs", js.undefined)
  }
}
