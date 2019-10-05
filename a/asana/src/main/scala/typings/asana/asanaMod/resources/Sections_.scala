package typings.asana.asanaMod.resources

import typings.asana.asanaMod.resources.Sections.Type
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Sections")
@js.native
trait Sections_ extends Resource {
  /**
    * Returns the complete record for a single section.
    * @param {String} section The section to get.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findById(section: String): ^[Type] = js.native
  def findById(section: String, params: Params): ^[Type] = js.native
  def findById(section: String, params: Params, dispatchOptions: js.Any): ^[Type] = js.native
  def findById(section: Double): ^[Type] = js.native
  def findById(section: Double, params: Params): ^[Type] = js.native
  def findById(section: Double, params: Params, dispatchOptions: js.Any): ^[Type] = js.native
  /**
    * Returns the compact records for all sections in the specified project.
    * @param {String} project The project to get sections from.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def findByProject(project: String): ^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params): ^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params, dispatchOptions: js.Any): ^[js.Array[Type]] = js.native
  def findByProject(project: Double): ^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params): ^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params, dispatchOptions: js.Any): ^[js.Array[Type]] = js.native
}

