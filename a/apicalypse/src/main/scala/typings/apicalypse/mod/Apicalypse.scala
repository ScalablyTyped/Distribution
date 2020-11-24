package typings.apicalypse.mod

import typings.axios.mod.AxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apicalypse extends js.Object {
  
  def fields(fields: String): Apicalypse = js.native
  def fields(fields: js.Array[String]): Apicalypse = js.native
  
  def limit(limit: Double): Apicalypse = js.native
  
  def multi(queries: js.Array[Apicalypse]): Apicalypse = js.native
  
  def offset(offset: Double): Apicalypse = js.native
  
  def query(endpoint: String, name: String): Apicalypse = js.native
  
  def request(url: String): js.Promise[AxiosResponse[_]] = js.native
  
  def requestAll(url: String): js.Promise[js.Array[_]] = js.native
  def requestAll(url: String, options: RequestAllConfig): js.Promise[js.Array[_]] = js.native
  
  def search(search: String): Apicalypse = js.native
  
  def sort(field: String): Apicalypse = js.native
  def sort(field: String, direction: SortDirection): Apicalypse = js.native
  
  def where(filters: String): Apicalypse = js.native
  def where(filters: js.Array[String]): Apicalypse = js.native
}
