package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsBSON extends js.Object {
  /**
    * Represents a BSON serializer
    */
  var BSON: org.scalablytyped.runtime.Instantiable1[
    /* types */ js.UndefOr[/* types */ js.Array[Anon_ArgsAnyType]], 
    adoneLib.adoneNs.dataNs.bsonNs.BSON
  ] = js.native
  /**
    * Represents BSON RegExp type
    */
  var BSONRegExp: org.scalablytyped.runtime.Instantiable2[
    /* pattern */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ java.lang.String], 
    adoneLib.adoneNs.dataNs.bsonNs.BSONRegExp
  ] = js.native
  /**
    * Represents a BSON Binary type
    */
  var Binary: Anon_BUFFERSIZE = js.native
  /**
    * Represents BSON Code type
    */
  var Code: org.scalablytyped.runtime.Instantiable2[
    /* code */ java.lang.String | (js.Function1[/* repeated */ js.Any, scala.Unit]), 
    /* scope */ js.UndefOr[/* scope */ js.Object], 
    adoneLib.adoneNs.dataNs.bsonNs.Code
  ] = js.native
  /**
    * Represents BSON DBRef type
    */
  var DBRef: org.scalablytyped.runtime.Instantiable3[
    /* namespace */ java.lang.String, 
    /* oid */ adoneLib.adoneNs.dataNs.bsonNs.ObjectId, 
    /* db */ js.UndefOr[/* db */ java.lang.String], 
    adoneLib.adoneNs.dataNs.bsonNs.DBRef
  ] = js.native
  /**
    * Represents BSON Decimal128 type
    */
  var Decimal128: Anon_Bytes = js.native
  /**
    * Represents BSON Double type
    */
  var Double: org.scalablytyped.runtime.Instantiable1[/* value */ scala.Double, adoneLib.adoneNs.dataNs.bsonNs.Double] = js.native
  val INs: js.Any = js.native
  /**
    * / **
    * Represents BSON Int32 type
    */
  var Int32: org.scalablytyped.runtime.Instantiable1[/* value */ scala.Double, adoneLib.adoneNs.dataNs.bsonNs.Int32] = js.native
  /**
    * Represents BSON Long type
    */
  var Long: Anon_MAXUNSIGNEDVALUE = js.native
  /**
    * Represents BSON MaxKey type
    */
  var MaxKey: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.dataNs.bsonNs.MaxKey] = js.native
  /**
    * Represents BSON MinKey type
    */
  var MinKey: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.dataNs.bsonNs.MinKey] = js.native
  /**
    * Represents BSON ObjectId type
    */
  var ObjectId: Anon_CreateFromHexString = js.native
  /**
    * Represents BSON Symbol type
    */
  var Symbol: org.scalablytyped.runtime.Instantiable1[/* value */ java.lang.String, adoneLib.adoneNs.dataNs.bsonNs.Symbol] = js.native
  /**
    * This type is for INTERNAL use in MongoDB only and should not be used in applications
    */
  var Timestamp: Anon_MAXUNSIGNEDVALUEMAXVALUE = js.native
  val cNs: Anon_BSONINT32MAX = js.native
  /**
    * BSON serializator instance
    */
  val serializer: adoneLib.adoneNs.dataNs.bsonNs.BSON = js.native
  /**
    * Decodes the given buffer with enabled buffers and values promoting
    */
  def decode(buf: nodeLib.Buffer): js.Any = js.native
  def decode(buf: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.bsonNs.INs.DeserializeOptions): js.Any = js.native
  /**
    * Encodes the given object
    */
  def encode(obj: js.Object): nodeLib.Buffer = js.native
  def encode(obj: js.Object, options: adoneLib.adoneNs.dataNs.bsonNs.INs.SerializeOptions): nodeLib.Buffer = js.native
}

