package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontType extends js.Object
@JSGlobal("__esri.CIM.FontType")
@js.native
object FontType extends js.Object {
  
  /**
    * OpenType with CFF outlines.
    */
  @js.native
  sealed trait PSOpenType extends FontType
  
  /**
    * OpenType with TrueType outlines.
    */
  @js.native
  sealed trait TTOpenType extends FontType
  
  /**
    * TrueType.
    */
  @js.native
  sealed trait TrueType extends FontType
  
  /**
    * Adobe Type 1.
    */
  @js.native
  sealed trait Type1 extends FontType
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait Unspecified extends FontType
}
