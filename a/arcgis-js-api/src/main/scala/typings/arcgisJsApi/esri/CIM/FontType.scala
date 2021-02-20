package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontType extends StObject
@JSGlobal("__esri.CIM.FontType")
@js.native
object FontType extends StObject {
  
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
