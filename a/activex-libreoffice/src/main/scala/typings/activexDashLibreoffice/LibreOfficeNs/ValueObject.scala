package typings.activexDashLibreoffice.LibreOfficeNs

import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]any`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]boolean`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]byte`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]char`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]double`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]float`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]long`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]object`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]short`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]string`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]unsigned long`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]unsigned short`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[][]unsigned`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]any`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]boolean`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]byte`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]char`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]double`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]float`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]long`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]object`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]short`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]string`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]unsigned long`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]unsigned short`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`[]unsigned`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`object`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`unsigned long`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.`unsigned short`
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.any
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.boolean
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.byte
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.char
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.double
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.float
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.long
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.short
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.string
import typings.activexDashLibreoffice.activexDashLibreofficeStrings.unsigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueObject extends js.Object {
  /** Returns the value contained in the object, when the Value Object was used as an `inout` or `out` parameter */
  def Get(): js.Any
  /** Initialize the object as an `inout` parameter */
  def InitInOutParam(
    `type`: `[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`),
    value: js.Any
  ): Unit
  /** Initialize the object as an `out` parameter */
  def InitOutParam(): Unit
  /** Assigns a type and a value */
  def Set(
    `type`: `[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`),
    value: js.Any
  ): Unit
}

object ValueObject {
  @scala.inline
  def apply(
    Get: () => js.Any,
    InitInOutParam: (`[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`), js.Any) => Unit,
    InitOutParam: () => Unit,
    Set: (`[][]any` | `[][]boolean` | `[][]byte` | `[][]char` | `[][]double` | `[][]float` | `[][]long` | `[][]object` | `[][]short` | `[][]string` | `[][]unsigned` | (`[][]unsigned long`) | (`[][]unsigned short`) | `[]any` | `[]boolean` | `[]byte` | `[]char` | `[]double` | `[]float` | `[]long` | `[]object` | `[]short` | `[]string` | `[]unsigned` | (`[]unsigned long`) | (`[]unsigned short`) | any | boolean | byte | char | double | float | long | `object` | short | string | unsigned | (`unsigned long`) | (`unsigned short`), js.Any) => Unit
  ): ValueObject = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction0(Get), InitInOutParam = js.Any.fromFunction2(InitInOutParam), InitOutParam = js.Any.fromFunction0(InitOutParam), Set = js.Any.fromFunction2(Set))
  
    __obj.asInstanceOf[ValueObject]
  }
}

