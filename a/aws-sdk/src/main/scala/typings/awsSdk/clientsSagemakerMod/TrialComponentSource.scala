package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentSource extends StObject {
  
  /**
    * The source ARN.
    */
  var SourceArn: TrialComponentSourceArn
  
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceType] = js.undefined
}
object TrialComponentSource {
  
  inline def apply(SourceArn: TrialComponentSourceArn): TrialComponentSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrialComponentSource] (val x: Self) extends AnyVal {
    
    inline def setSourceArn(value: TrialComponentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
