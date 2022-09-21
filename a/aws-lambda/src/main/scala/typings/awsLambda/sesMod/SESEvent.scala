package typings.awsLambda.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESEvent extends StObject {
  
  var Records: js.Array[SESEventRecord]
}
object SESEvent {
  
  inline def apply(Records: js.Array[SESEventRecord]): SESEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESEvent]
  }
  
  extension [Self <: SESEvent](x: Self) {
    
    inline def setRecords(value: js.Array[SESEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: SESEventRecord*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
