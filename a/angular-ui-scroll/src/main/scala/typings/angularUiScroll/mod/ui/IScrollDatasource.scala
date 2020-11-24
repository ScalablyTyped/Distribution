package typings.angularUiScroll.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollDatasource[T] extends js.Object {
  
  /**
    * The datasource object implements methods and properties to be used by the directive to access the data
    *
    * @param index indicates the first data row requested
    *
    * @param count indicates number of data rows requested
    *
    * @param success function to call when the data are retrieved. The implementation of the service has to call
    * this function when the data are retrieved and pass it an array of the items retrieved. If no items are
    * retrieved, an empty array has to be passed.
    *
    * Important: Make sure to respect the index and count parameters of the request. The array passed to the
    * success method should have exactly count elements unless it hit eof/bof
    */
  def get(index: Double, count: Double, success: js.Function1[/* results */ js.Array[T], _]): Unit = js.native
}
object IScrollDatasource {
  
  @scala.inline
  def apply[T](get: (Double, Double, js.Function1[/* results */ js.Array[T], _]) => Unit): IScrollDatasource[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[IScrollDatasource[T]]
  }
  
  @scala.inline
  implicit class IScrollDatasourceOps[Self <: IScrollDatasource[_], T] (val x: Self with IScrollDatasource[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: (Double, Double, js.Function1[/* results */ js.Array[T], _]) => Unit): Self = this.set("get", js.Any.fromFunction3(value))
  }
}
