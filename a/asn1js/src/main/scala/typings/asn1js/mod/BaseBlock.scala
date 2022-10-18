package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBlock[T /* <: ValueBlock */, J /* <: ValueBlockJson */]
  extends StObject
     with LocalBaseBlock
     with IBaseBlock
     with IBerConvertible {
  
  var idBlock: LocalIdentificationBlock = js.native
  
  /**
    * Determines whether two object instances are equal
    * @param other Object to compare with the current object
    */
  def isEqual(other: scala.Any): scala.Boolean = js.native
  
  var lenBlock: LocalLengthBlock = js.native
  
  /* protected */ def onAsciiEncoding(): String = js.native
  
  def toBER(sizeOnly: scala.Boolean, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: Unit, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  
  def toString(encoding: StringEncoding): String = js.native
  
  var valueBlock: T = js.native
}
