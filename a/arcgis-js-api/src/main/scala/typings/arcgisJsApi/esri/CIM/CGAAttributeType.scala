package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CGAAttributeType extends js.Object
@JSGlobal("__esri.CIM.CGAAttributeType")
@js.native
object CGAAttributeType extends js.Object {
  
  /**
    * Boolean - Attribute is a boolean
    */
  @js.native
  sealed trait Boolean extends CGAAttributeType
  
  /**
    * Float - Attribute is a numeric attribute that is a float value
    */
  @js.native
  sealed trait Float extends CGAAttributeType
  
  /**
    * String - Attribute is a string
    */
  @js.native
  sealed trait String extends CGAAttributeType
}
