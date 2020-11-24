package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "OneOf")
@js.native
class OneOf protected () extends ReflectionObject {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String) = this()
  def this(name: String, fieldNames: js.Array[String]) = this()
  def this(name: String, fieldNames: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(name: String, fieldNames: js.UndefOr[scala.Nothing], options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    fieldNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(name: String, fieldNames: js.Array[String], options: js.UndefOr[scala.Nothing], comment: String) = this()
  def this(
    name: String,
    fieldNames: js.Array[String],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.UndefOr[js.Any]],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.UndefOr[js.Any]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  
  /**
    * Adds a field to this oneof and removes it from its current parent, if any.
    * @param field Field to add
    * @returns `this`
    */
  def add(field: Field): OneOf = js.native
  
  /** Fields that belong to this oneof as an array for iteration. */
  val fieldsArray: js.Array[Field] = js.native
  
  /** Field names that belong to this oneof. */
  var oneof: js.Array[String] = js.native
  
  /**
    * Removes a field from this oneof and puts it back to the oneof's parent.
    * @param field Field to remove
    * @returns `this`
    */
  def remove(field: Field): OneOf = js.native
  
  def toJSON(toJSONOptions: IToJSONOptions): IOneOf = js.native
}
/* static members */
@JSImport("@apollo/protobufjs", "OneOf")
@js.native
object OneOf extends js.Object {
  
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  def d[T /* <: String */](fieldNames: String*): OneOfDecorator = js.native
  
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IOneOf): OneOf = js.native
}
