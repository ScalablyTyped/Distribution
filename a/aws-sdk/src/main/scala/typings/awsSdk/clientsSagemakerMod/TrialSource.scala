package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: TrialSourceArn
  
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceType] = js.undefined
}
object TrialSource {
  
  inline def apply(SourceArn: TrialSourceArn): TrialSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialSource]
  }
  
  extension [Self <: TrialSource](x: Self) {
    
    inline def setSourceArn(value: TrialSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
