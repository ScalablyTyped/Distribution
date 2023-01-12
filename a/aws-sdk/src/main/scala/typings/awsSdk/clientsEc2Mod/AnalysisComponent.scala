package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisComponent extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the component.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the analysis component.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object AnalysisComponent {
  
  inline def apply(): AnalysisComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisComponent] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
