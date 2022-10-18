package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueBlock
  extends StObject
     with LocalBaseBlock
     with IBerConvertible {
  
  def toBER(sizeOnly: scala.Boolean, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
  def toBER(sizeOnly: Unit, writer: ViewWriter): js.typedarray.ArrayBuffer = js.native
}
