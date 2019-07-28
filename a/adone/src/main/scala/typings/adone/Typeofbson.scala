package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.adone.adoneNs.dataNs.bsonNs.BSON
import typings.adone.adoneNs.dataNs.bsonNs.INs.DeserializeOptions
import typings.adone.adoneNs.dataNs.bsonNs.INs.SerializeOptions
import typings.adone.adoneNs.dataNs.bsonNs.ObjectId
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbson extends js.Object {
  /**
    * Represents a BSON serializer
    */
  var BSON: Instantiable1[
    js.UndefOr[/* types */ js.Array[Anon_ArgsAny]], 
    typings.adone.adoneNs.dataNs.bsonNs.BSON
  ] = js.native
  /**
    * Represents BSON RegExp type
    */
  var BSONRegExp: Instantiable2[
    /* pattern */ String, 
    js.UndefOr[/* options */ String], 
    typings.adone.adoneNs.dataNs.bsonNs.BSONRegExp
  ] = js.native
  /**
    * Represents a BSON Binary type
    */
  var Binary: TypeofClassBinary = js.native
  /**
    * Represents BSON Code type
    */
  var Code: Instantiable2[
    /* code */ String | (js.Function1[/* repeated */ js.Any, Unit]), 
    js.UndefOr[/* scope */ js.Object], 
    typings.adone.adoneNs.dataNs.bsonNs.Code
  ] = js.native
  /**
    * Represents BSON DBRef type
    */
  var DBRef: Instantiable3[
    /* namespace */ String, 
    /* oid */ ObjectId, 
    js.UndefOr[/* db */ String], 
    typings.adone.adoneNs.dataNs.bsonNs.DBRef
  ] = js.native
  /**
    * Represents BSON Decimal128 type
    */
  var Decimal128: TypeofClassDecimal128 = js.native
  /**
    * Represents BSON Double type
    */
  var Double: Instantiable1[/* value */ scala.Double, typings.adone.adoneNs.dataNs.bsonNs.Double] = js.native
  val INs: js.Any = js.native
  /**
    * / **
    * Represents BSON Int32 type
    */
  var Int32: Instantiable1[/* value */ Double, typings.adone.adoneNs.dataNs.bsonNs.Int32] = js.native
  /**
    * Represents BSON Long type
    */
  var Long: TypeofClassLong = js.native
  /**
    * Represents BSON MaxKey type
    */
  var MaxKey: Instantiable0[typings.adone.adoneNs.dataNs.bsonNs.MaxKey] = js.native
  /**
    * Represents BSON MinKey type
    */
  var MinKey: Instantiable0[typings.adone.adoneNs.dataNs.bsonNs.MinKey] = js.native
  /**
    * Represents BSON ObjectId type
    */
  var ObjectId: TypeofClassObjectId = js.native
  /**
    * Represents BSON Symbol type
    */
  var Symbol: Instantiable1[/* value */ String, typings.adone.adoneNs.dataNs.bsonNs.Symbol] = js.native
  /**
    * This type is for INTERNAL use in MongoDB only and should not be used in applications
    */
  var Timestamp: TypeofClassTimestamp = js.native
  val cNs: Typeofc = js.native
  /**
    * BSON serializator instance
    */
  val serializer: BSON = js.native
  /**
    * Decodes the given buffer with enabled buffers and values promoting
    */
  def decode(buf: Buffer): js.Any = js.native
  def decode(buf: Buffer, options: DeserializeOptions): js.Any = js.native
  /**
    * Encodes the given object
    */
  def encode(obj: js.Object): Buffer = js.native
  def encode(obj: js.Object, options: SerializeOptions): Buffer = js.native
}

