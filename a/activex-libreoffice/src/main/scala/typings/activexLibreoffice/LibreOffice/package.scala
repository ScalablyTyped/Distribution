package typings.activexLibreoffice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object LibreOffice {
  
  type InstantiableNameMap = typings.activexLibreoffice.LibreOffice.ServicesNameMap with typings.activexLibreoffice.LibreOffice.StructNameMap
  
  type SeqEquiv[T] = typings.std.SafeArray[T] | typings.activexLibreoffice.sequence[T] | js.Array[T]
}
