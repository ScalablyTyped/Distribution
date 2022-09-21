package typings.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.apolloProtobufjsStrings.bool
import typings.apolloProtobufjs.apolloProtobufjsStrings.bytes
import typings.apolloProtobufjs.apolloProtobufjsStrings.double
import typings.apolloProtobufjs.apolloProtobufjsStrings.fixed32
import typings.apolloProtobufjs.apolloProtobufjsStrings.fixed64
import typings.apolloProtobufjs.apolloProtobufjsStrings.float
import typings.apolloProtobufjs.apolloProtobufjsStrings.int32
import typings.apolloProtobufjs.apolloProtobufjsStrings.int64
import typings.apolloProtobufjs.apolloProtobufjsStrings.sfixed32
import typings.apolloProtobufjs.apolloProtobufjsStrings.sfixed64
import typings.apolloProtobufjs.apolloProtobufjsStrings.sint32
import typings.apolloProtobufjs.apolloProtobufjsStrings.sint64
import typings.apolloProtobufjs.apolloProtobufjsStrings.string
import typings.apolloProtobufjs.apolloProtobufjsStrings.uint32
import typings.apolloProtobufjs.apolloProtobufjsStrings.uint64
import typings.apolloProtobufjs.mod.Constructor
import typings.apolloProtobufjs.mod.FieldDecorator
import typings.apolloProtobufjs.mod.IMapField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "MapField")
@js.native
open class MapField protected ()
  extends typings.apolloProtobufjs.mod.MapField {
  /**
    * Constructs a new map field instance.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param keyType Key type
    * @param type Value type
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String, id: Double, keyType: String, `type`: String) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: StringDictionary[Any]) = this()
  def this(
    name: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[Any],
    comment: String
  ) = this()
  def this(name: String, id: Double, keyType: String, `type`: String, options: Unit, comment: String) = this()
}
/* static members */
object MapField {
  
  @JSImport("@apollo/protobufjs/light", "MapField")
  @js.native
  val ^ : js.Any = js.native
  
  inline def d[T /* <: StringDictionary[
    Double | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typings.apolloProtobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: double | float | int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string | bytes
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  /**
    * Map field decorator (TypeScript).
    * @param fieldId Field id
    * @param fieldKeyType Field key type
    * @param fieldValueType Field value type
    * @returns Decorator function
    */
  inline def d[T /* <: StringDictionary[
    Double | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typings.apolloProtobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: js.Object
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  inline def d[T /* <: StringDictionary[
    Double | String | Boolean | js.typedarray.Uint8Array | js.Array[Double] | typings.apolloProtobufjs.mod.Message[js.Object]
  ] */](
    fieldId: Double,
    fieldKeyType: int32 | uint32 | sint32 | fixed32 | sfixed32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | string,
    fieldValueType: Constructor[js.Object]
  ): FieldDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("d")(fieldId.asInstanceOf[js.Any], fieldKeyType.asInstanceOf[js.Any], fieldValueType.asInstanceOf[js.Any])).asInstanceOf[FieldDecorator]
  
  /**
    * Constructs a map field from a map field descriptor.
    * @param name Field name
    * @param json Map field descriptor
    * @returns Created map field
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IMapField): typings.apolloProtobufjs.mod.MapField = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.apolloProtobufjs.mod.MapField]
}
