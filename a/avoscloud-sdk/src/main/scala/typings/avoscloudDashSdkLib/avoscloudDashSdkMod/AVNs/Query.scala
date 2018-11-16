package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

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
@js.native
trait Query extends BaseObject {
  var className: java.lang.String = js.native
  var objectClass: js.Any = js.native
  def addAscending(key: java.lang.String): Query = js.native
  def addAscending(key: js.Array[java.lang.String]): Query = js.native
  def addDescending(key: java.lang.String): Query = js.native
  def addDescending(key: js.Array[java.lang.String]): Query = js.native
  def ascending(key: java.lang.String): Query = js.native
  def ascending(key: js.Array[java.lang.String]): Query = js.native
  def collection(): Collection[js.Object] = js.native
  def collection(items: js.Array[js.Object]): Collection[js.Object] = js.native
  def collection(
    items: js.Array[js.Object],
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs.Options
  ): Collection[js.Object] = js.native
  def containedIn(key: java.lang.String, values: js.Array[_]): Query = js.native
  def contains(key: java.lang.String, substring: java.lang.String): Query = js.native
  def containsAll(key: java.lang.String, values: js.Array[_]): Query = js.native
  def count[T](): Promise[T] = js.native
  def count[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.QueryNs.CountOptions): Promise[T] = js.native
  def descending(key: java.lang.String): Query = js.native
  def descending(key: js.Array[java.lang.String]): Query = js.native
  def doesNotExist(key: java.lang.String): Query = js.native
  def doesNotMatchKeyInQuery(key: java.lang.String, queryKey: java.lang.String, query: Query): Query = js.native
  def doesNotMatchQuery(key: java.lang.String, query: Query): Query = js.native
  def each[T](callback: js.Function): Promise[T] = js.native
  def each[T](callback: js.Function, options: SuccessFailureOptions): Promise[T] = js.native
  def endsWith(key: java.lang.String, suffix: java.lang.String): Query = js.native
  def equalTo(key: java.lang.String, value: js.Any): Query = js.native
  def exists(key: java.lang.String): Query = js.native
  def find[T](): Promise[T] = js.native
  def find[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.QueryNs.FindOptions): Promise[T] = js.native
  def first[T](): Promise[T] = js.native
  def first[T](options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.QueryNs.FirstOptions): Promise[T] = js.native
  def get(objectId: java.lang.String): Promise[_] = js.native
  def get(
    objectId: java.lang.String,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.QueryNs.GetOptions
  ): Promise[_] = js.native
  def greaterThan(key: java.lang.String, value: js.Any): Query = js.native
  def greaterThanOrEqualTo(key: java.lang.String, value: js.Any): Query = js.native
  def include(key: java.lang.String): Query = js.native
  def include(keys: js.Array[java.lang.String]): Query = js.native
  def lessThan(key: java.lang.String, value: js.Any): Query = js.native
  def lessThanOrEqualTo(key: java.lang.String, value: js.Any): Query = js.native
  def limit(n: scala.Double): Query = js.native
  def matches(key: java.lang.String, regex: stdLib.RegExp, modifiers: js.Any): Query = js.native
  def matchesKeyInQuery(key: java.lang.String, queryKey: java.lang.String, query: Query): Query = js.native
  def matchesQuery(key: java.lang.String, query: Query): Query = js.native
  def near(key: java.lang.String, point: GeoPoint): Query = js.native
  def notContainedIn(key: java.lang.String, values: js.Array[_]): Query = js.native
  def notEqualTo(key: java.lang.String, value: js.Any): Query = js.native
  def select(keys: java.lang.String*): Query = js.native
  def skip(n: scala.Double): Query = js.native
  def startsWith(key: java.lang.String, prefix: java.lang.String): Query = js.native
  def withinGeoBox(key: java.lang.String, southwest: GeoPoint, northeast: GeoPoint): Query = js.native
  def withinKilometers(key: java.lang.String, point: GeoPoint, maxDistance: scala.Double): Query = js.native
  def withinMiles(key: java.lang.String, point: GeoPoint, maxDistance: scala.Double): Query = js.native
  def withinRadians(key: java.lang.String, point: GeoPoint, maxDistance: scala.Double): Query = js.native
}

