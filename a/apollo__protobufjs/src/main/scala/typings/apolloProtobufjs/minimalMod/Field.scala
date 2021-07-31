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
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: String) = this()
  def this(name: String, id: Double, `type`: String, rule: Unit, extend: StringDictionary[js.UndefOr[js.Any]]) = this()
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
    rule: String,
    extend: Unit,
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
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: StringDictionary[js.UndefOr[js.Any]],
    extend: Unit,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: String,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    id: Double,
    `type`: String,
    rule: Unit,
    extend: Unit,
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
}
/* static members */
object Field {
  
  @JSImport("@apollo/protobufjs/minimal", "Field")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @param [defaultValue] Default value
    * @returns Decorator function
    */
  @scala.inline
  def d[T /* <: Double | (js.Array[Boolean | Buffer | Double | Long | String | Uint8Array]) | Long | String | Boolean | Uint8Array | Buffer */](
    fieldId: Double,
    fieldType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | string | bool | bytes | js.Object,
    fieldRule: js.UndefOr[optional | required | repeated],
    defaultValue: js.UndefOr[T]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  @scala.inline
  def d[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldType Field type
    * @param [fieldRule="optional"] Field rule
    * @returns Decorator function
    */
  @scala.inline
  def d[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T]): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  @scala.inline
  def d_optional[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: optional): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  @scala.inline
  def d_optional[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: optional): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  @scala.inline
  def d_repeated[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  @scala.inline
  def d_repeated[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: repeated): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  @scala.inline
  def d_required[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: String, fieldRule: required): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  @scala.inline
  def d_required[T /* <: typings.apolloProtobufjs.mod.Message[T] */](fieldId: Double, fieldType: Constructor[T], fieldRule: required): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldType.asInstanceOf[js.Any], fieldRule.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a field from a field descriptor.
    * @param name Field name
    * @param json Field descriptor
    * @returns Created field
    * @throws {TypeError} If arguments are invalid
    */
  @scala.inline
  def fromJSON(name: String, json: IField): typings.apolloProtobufjs.mod.Field = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.apolloProtobufjs.mod.Field]
}
