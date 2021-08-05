package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "Enum")
@js.native
class Enum protected () extends ReflectionObject {
  /**
    * Constructs a new enum instance.
    * @param name Unique name within its namespace
    * @param [values] Enum values as an object, by name
    * @param [options] Declared options
    * @param [comment] The comment for this enum
    * @param [comments] The value comments for this enum
    */
  def this(name: String) = this()
  def this(name: String, values: StringDictionary[js.UndefOr[Double]]) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(name: String, values: Unit, options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(name: String, values: StringDictionary[js.UndefOr[Double]], options: Unit, comment: String) = this()
  def this(name: String, values: Unit, options: StringDictionary[js.UndefOr[js.Any]], comment: String) = this()
  def this(name: String, values: Unit, options: Unit, comment: String) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: Unit,
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: Unit,
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: Unit,
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: Unit,
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  
  /**
    * Adds a value to this enum.
    * @param name Value name
    * @param id Value id
    * @param [comment] Comment, if any
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a value with this name or id
    */
  def add(name: String, id: Double): Enum = js.native
  def add(name: String, id: Double, comment: String): Enum = js.native
  
  /** Value comment texts, if any. */
  var comments: StringDictionary[js.UndefOr[String]] = js.native
  
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(id: Double): Boolean = js.native
  
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(name: String): Boolean = js.native
  
  /**
    * Removes a value from this enum
    * @param name Value name
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `name` is not a name of this enum
    */
  def remove(name: String): Enum = js.native
  
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[Double] | String] = js.native
  
  def toJSON(toJSONOptions: IToJSONOptions): IEnum = js.native
  
  /** Enum values by name. */
  var values: StringDictionary[js.UndefOr[Double]] = js.native
  
  /** Enum values by id. */
  var valuesById: NumberDictionary[js.UndefOr[String]] = js.native
}
/* static members */
object Enum {
  
  @JSImport("@apollo/protobufjs", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IEnum): Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[Enum]
}
