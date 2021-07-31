package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "ReflectionObject")
@js.native
abstract class ReflectionObject () extends StObject {
  
  /** Comment text, if any. */
  var comment: String | Null = js.native
  
  /** Defining file name. */
  var filename: String | Null = js.native
  
  /** Full name including leading dot. */
  val fullName: String = js.native
  
  /**
    * Gets an option value.
    * @param name Option name
    * @returns Option value or `undefined` if not set
    */
  def getOption(name: String): js.Any = js.native
  
  /** Unique name within its namespace. */
  var name: String = js.native
  
  /**
    * Called when this object is added to a parent.
    * @param parent Parent added to
    */
  def onAdd(parent: ReflectionObject): Unit = js.native
  
  /**
    * Called when this object is removed from a parent.
    * @param parent Parent removed from
    */
  def onRemove(parent: ReflectionObject): Unit = js.native
  
  /** Options. */
  var options: js.UndefOr[StringDictionary[js.UndefOr[js.Any]]] = js.native
  
  /** Parent namespace. */
  var parent: Namespace | Null = js.native
  
  /**
    * Resolves this objects type references.
    * @returns `this`
    */
  def resolve(): ReflectionObject = js.native
  
  /** Whether already resolved or not. */
  var resolved: Boolean = js.native
  
  /** Reference to the root namespace. */
  val root: Root = js.native
  
  /**
    * Sets an option.
    * @param name Option name
    * @param value Option value
    * @param [ifNotSet] Sets the option only if it isn't currently set
    * @returns `this`
    */
  def setOption(name: String, value: js.Any): ReflectionObject = js.native
  def setOption(name: String, value: js.Any, ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets multiple options.
    * @param options Options to set
    * @param [ifNotSet] Sets an option only if it isn't currently set
    * @returns `this`
    */
  def setOptions(options: StringDictionary[js.UndefOr[js.Any]]): ReflectionObject = js.native
  def setOptions(options: StringDictionary[js.UndefOr[js.Any]], ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Converts this reflection object to its descriptor representation.
    * @returns Descriptor
    */
  def toJSON(): StringDictionary[js.UndefOr[js.Any]] = js.native
}
