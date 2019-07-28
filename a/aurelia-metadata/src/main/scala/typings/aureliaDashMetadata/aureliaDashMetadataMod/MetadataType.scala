package typings.aureliaDashMetadata.aureliaDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataType extends js.Object {
  /**
    * The metadata key representing parameter type information.
    */
  var paramTypes: String = js.native
  /**
    * The metadata key representing property information.
    */
  var properties: String = js.native
  /**
    * The metadata key representing object property type information.
    */
  var propertyType: String = js.native
  /**
    * The metadata key representing pluggable resources.
    */
  var resource: String = js.native
  /**
    * Defines metadata specified by a key on a target.
    * @param metadataKey The key for the metadata to define.
    * @param target The target to set the metadata on.
    * @param targetKey The member on the target to set the metadata on.
    */
  def define(metadataKey: String, metadataValue: js.Object, target: js.Function): Unit = js.native
  def define(metadataKey: String, metadataValue: js.Object, target: js.Function, targetKey: String): Unit = js.native
  /**
    * Gets metadata specified by a key on a target, searching up the inheritance hierarchy.
    * @param metadataKey The key for the metadata to lookup.
    * @param target The target to lookup the metadata on.
    * @param targetKey The member on the target to lookup the metadata on.
    */
  def get(metadataKey: String, target: js.Function): js.Object = js.native
  def get(metadataKey: String, target: js.Function, targetKey: String): js.Object = js.native
  /**
    * Gets metadata specified by a key on a target, or creates an instance of the specified metadata if not found.
    * @param metadataKey The key for the metadata to lookup or create.
    * @param Type The type of metadata to create if existing metadata is not found.
    * @param target The target to lookup or create the metadata on.
    * @param targetKey The member on the target to lookup or create the metadata on.
    */
  def getOrCreateOwn(metadataKey: String, Type: js.Function, target: js.Function): js.Object = js.native
  def getOrCreateOwn(metadataKey: String, Type: js.Function, target: js.Function, targetKey: String): js.Object = js.native
  /**
    * Gets metadata specified by a key on a target, only searching the own instance.
    * @param metadataKey The key for the metadata to lookup.
    * @param target The target to lookup the metadata on.
    * @param targetKey The member on the target to lookup the metadata on.
    */
  def getOwn(metadataKey: String, target: js.Function): js.Object = js.native
  def getOwn(metadataKey: String, target: js.Function, targetKey: String): js.Object = js.native
}

