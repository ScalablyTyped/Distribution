package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: ExperimentSourceArn
  
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceType] = js.undefined
}
object ExperimentSource {
  
  inline def apply(SourceArn: ExperimentSourceArn): ExperimentSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentSource] (val x: Self) extends AnyVal {
    
    inline def setSourceArn(value: ExperimentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
