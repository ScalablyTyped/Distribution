package typings.avoscloudDashSdk.avoscloudDashSdkMod

import typings.avoscloudDashSdk.avoscloudDashSdkMod.Collection.Options
import typings.avoscloudDashSdk.avoscloudDashSdkMod.Query.CountOptions
import typings.avoscloudDashSdk.avoscloudDashSdkMod.Query.FindOptions
import typings.avoscloudDashSdk.avoscloudDashSdkMod.Query.FirstOptions
import typings.avoscloudDashSdk.avoscloudDashSdkMod.Query.GetOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new AV AV.Query for the given AV.Object subclass.
  * @param objectClass -
  *   An instance of a subclass of AV.Object, or a AV className string.
  * @class
  *
  * <p>AV.Query defines a query that is used to fetch AV.Objects. The
  * most common use case is finding all objects that match a query through the
  * <code>find</code> method. For example, this sample code fetches all objects
  * of class <code>MyClass</code>. It calls a different function depending on
  * whether the fetch succeeded or not.
  *
  * <pre>
  * var query = new AV.Query(MyClass);
  * query.find({
  *   success: function(results) {
  *     // results is an array of AV.Object.
  *   },
  *
  *   error: function(error) {
  *     // error is an instance of AV.Error.
  *   }
  * });</pre></p>
  *
  * <p>A AV.Query can also be used to retrieve a single object whose id is
  * known, through the get method. For example, this sample code fetches an
  * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
  * different function depending on whether the fetch succeeded or not.
  *
  * <pre>
  * var query = new AV.Query(MyClass);
  * query.get(myId, {
  *   success: function(object) {
  *     // object is an instance of AV.Object.
  *   },
  *
  *   error: function(object, error) {
  *     // error is an instance of AV.Error.
  *   }
  * });</pre></p>
  *
  * <p>A AV.Query can also be used to count the number of objects that match
  * the query without retrieving all of those objects. For example, this
  * sample code counts the number of objects of the class <code>MyClass</code>
  * <pre>
  * var query = new AV.Query(MyClass);
  * query.count({
  *   success: function(number) {
  *     // There are number instances of MyClass.
  *   },
  *
  *   error: function(error) {
  *     // error is an instance of AV.Error.
  *   }
  * });</pre></p>
  */
@JSImport("avoscloud-sdk", "Query")
@js.native
class Query_ protected () extends BaseObject {
  def this(objectClass: js.Any) = this()
  var className: String = js.native
  var objectClass: js.Any = js.native
  def addAscending(key: String): Query = js.native
  def addAscending(key: js.Array[String]): Query = js.native
  def addDescending(key: String): Query = js.native
  def addDescending(key: js.Array[String]): Query = js.native
  def ascending(key: String): Query = js.native
  def ascending(key: js.Array[String]): Query = js.native
  def collection(): Collection[Object] = js.native
  def collection(items: js.Array[Object]): Collection[Object] = js.native
  def collection(items: js.Array[Object], options: Options): Collection[Object] = js.native
  def containedIn(key: String, values: js.Array[_]): Query = js.native
  def contains(key: String, substring: String): Query = js.native
  def containsAll(key: String, values: js.Array[_]): Query = js.native
  def count[T](): Promise[T] = js.native
  def count[T](options: CountOptions): Promise[T] = js.native
  def descending(key: String): Query = js.native
  def descending(key: js.Array[String]): Query = js.native
  def doesNotExist(key: String): Query = js.native
  def doesNotMatchKeyInQuery(key: String, queryKey: String, query: Query): Query = js.native
  def doesNotMatchQuery(key: String, query: Query): Query = js.native
  def each[T](callback: js.Function): Promise[T] = js.native
  def each[T](callback: js.Function, options: SuccessFailureOptions): Promise[T] = js.native
  def endsWith(key: String, suffix: String): Query = js.native
  def equalTo(key: String, value: js.Any): Query = js.native
  def exists(key: String): Query = js.native
  def find[T](): Promise[T] = js.native
  def find[T](options: FindOptions): Promise[T] = js.native
  def first[T](): Promise[T] = js.native
  def first[T](options: FirstOptions): Promise[T] = js.native
  def get(objectId: String): Promise[_] = js.native
  def get(objectId: String, options: GetOptions): Promise[_] = js.native
  def greaterThan(key: String, value: js.Any): Query = js.native
  def greaterThanOrEqualTo(key: String, value: js.Any): Query = js.native
  def include(key: String): Query = js.native
  def include(keys: js.Array[String]): Query = js.native
  def lessThan(key: String, value: js.Any): Query = js.native
  def lessThanOrEqualTo(key: String, value: js.Any): Query = js.native
  def limit(n: Double): Query = js.native
  def matches(key: String, regex: RegExp, modifiers: js.Any): Query = js.native
  def matchesKeyInQuery(key: String, queryKey: String, query: Query): Query = js.native
  def matchesQuery(key: String, query: Query): Query = js.native
  def near(key: String, point: GeoPoint): Query = js.native
  def notContainedIn(key: String, values: js.Array[_]): Query = js.native
  def notEqualTo(key: String, value: js.Any): Query = js.native
  def select(keys: String*): Query = js.native
  def skip(n: Double): Query = js.native
  def startsWith(key: String, prefix: String): Query = js.native
  def withinGeoBox(key: String, southwest: GeoPoint, northeast: GeoPoint): Query = js.native
  def withinKilometers(key: String, point: GeoPoint, maxDistance: Double): Query = js.native
  def withinMiles(key: String, point: GeoPoint, maxDistance: Double): Query = js.native
  def withinRadians(key: String, point: GeoPoint, maxDistance: Double): Query = js.native
}

