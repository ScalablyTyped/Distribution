package typings.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.apolloProtobufjsStrings.bool
import typings.apolloProtobufjs.apolloProtobufjsStrings.bytes
import typings.apolloProtobufjs.apolloProtobufjsStrings.double
import typings.apolloProtobufjs.apolloProtobufjsStrings.fixed32
import typings.apolloProtobufjs.apolloProtobufjsStrings.fixed64
import typings.apolloProtobufjs.apolloProtobufjsStrings.float
import typings.apolloProtobufjs.apolloProtobufjsStrings.int32
import typings.apolloProtobufjs.apolloProtobufjsStrings.int64
import typings.apolloProtobufjs.apolloProtobufjsStrings.optional
import typings.apolloProtobufjs.apolloProtobufjsStrings.repeated
import typings.apolloProtobufjs.apolloProtobufjsStrings.required
import typings.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typings.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typings.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typings.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typings.apolloProtobufjs.apolloProtobufjsStrings.string
import typings.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typings.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typings.apolloProtobufjs.mod.Buffer
import typings.apolloProtobufjs.mod.Constructor
import typings.apolloProtobufjs.mod.FieldDecorator
import typings.apolloProtobufjs.mod.IField
import typings.long.mod.Long
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Field")
@js.native
class Field protected ()
  extends typings.apolloProtobufjs.mod.Field {
  /**
    * Constructs a new message field instance. Note that {@link MapField|map fields} have their own class.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param type Value type
    * @param [rule="optional"] Field rule
    * @param [extend] Extended type if different from parent
    * @param [options] Declared options
    */
  def this(name: String, id: Double, `type`: String) = this()
  def this(name: String, id: Double, `type`: String, rule: String) = this()
  def this(name: String, id: Double, `type`: String, rule: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(name: String, id: Double, `type`: String, rule: js.UndefOr[scala.Nothing], extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(name: String, id: Double, `type`: String, rule: String, extend: String) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: String
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: js.UndefOr[scala.Nothing],
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: String,
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
}
/* static members */
object Field {
  
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]) | Long | String | Boolean | Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: js.UndefOr[optional | required | repeated],
    defaultValue: js.UndefOr[T]
  ): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = js.native
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d_optional[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d_optional[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d_repeated[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d_repeated[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d_required[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = js.native
  @JSImport("@apollo/protobufjs/minimal", "Field.d")
  @js.native
  def d_required[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = js.native
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("@apollo/protobufjs/minimal", "Field.fromJSON")
  @js.native
  def fromJSON(name: String, json: IField): typings.apolloProtobufjs.mod.Field = js.native
}
