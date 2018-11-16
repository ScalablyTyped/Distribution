package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Asn1jsNs {
  type Boolean = BaseBlock[LocalBooleanValueBlock]
  type CharacterString = LocalSimpleStringBlock
  type Constructed = BaseBlock[LocalConstructedValueBlock]
  type DATE = Utf8String
  type DateTime = Utf8String
  type Duration = Utf8String
  type EndOfContent = BaseBlock[LocalEndOfContentValueBlock]
  type Enumerated = Integer
  type GeneralString = LocalSimpleStringBlock
  type GraphicString = LocalSimpleStringBlock
  type IA5String = LocalSimpleStringBlock
  type LocalEndOfContentValueBlockParams = LocalBaseBlockParams
  type Null = BaseBlock[LocalValueBlock]
  type NumericString = LocalSimpleStringBlock
  type ObjectIdentifier = BaseBlock[LocalObjectIdentifierValueBlock]
  type Primitive = BaseBlock[LocalPrimitiveValueBlock]
  type PrintableString = LocalSimpleStringBlock
  type Sequence = Constructed
  type Set = Constructed
  type TIME = Utf8String
  type TeletexString = LocalSimpleStringBlock
  type TimeOfDay = Utf8String
  type VideotexString = LocalSimpleStringBlock
  type VisibleString = LocalSimpleStringBlock
}
