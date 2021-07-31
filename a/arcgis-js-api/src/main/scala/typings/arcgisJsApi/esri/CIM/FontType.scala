package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  sealed trait PSOpenType
    extends StObject
       with FontType
  
  /**
    * OpenType with TrueType outlines.
    */
  @js.native
  sealed trait TTOpenType
    extends StObject
       with FontType
  
  /**
    * TrueType.
    */
  @js.native
  sealed trait TrueType
    extends StObject
       with FontType
  
  /**
    * Adobe Type 1.
    */
  @js.native
  sealed trait Type1
    extends StObject
       with FontType
  
  /**
    * Unspecified.
    */
  @js.native
  sealed trait Unspecified
    extends StObject
       with FontType
}
