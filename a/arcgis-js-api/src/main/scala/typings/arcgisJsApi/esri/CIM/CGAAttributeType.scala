package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CGAAttributeType extends StObject
@JSGlobal("__esri.CIM.CGAAttributeType")
@js.native
object CGAAttributeType extends StObject {
  
  /**
    * Boolean - Attribute is a boolean
    */
  @js.native
  sealed trait Boolean
    extends StObject
       with CGAAttributeType
  
  /**
    * Float - Attribute is a numeric attribute that is a float value
    */
  @js.native
  sealed trait Float
    extends StObject
       with CGAAttributeType
  
  /**
    * String - Attribute is a string
    */
  @js.native
  sealed trait String
    extends StObject
       with CGAAttributeType
}
