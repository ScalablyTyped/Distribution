package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read only access to a configuration component schema.
  *
  * A component is a set of hierarchically organized and semantically related configuration settings, e.g StarWriter settings.
  *
  * A component schema contains two separate sections, one which describes the templates to be used in the dynamic containers (sets) of the component and
  * one which describes the component's data structure.
  * @see com.sun.star.configuration.backend.Layer Service providing access to individual configuration data for an entity.
  * @since OOo 1.1.2
  */
@js.native
trait Schema extends XSchema {
  /**
    * The URL of the layer data.
    * @since OOo 2.0
    */
  var URL: String = js.native
}

object Schema {
  @scala.inline
  def apply(
    URL: String,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    readComponent: XSchemaHandler => Unit,
    readSchema: XSchemaHandler => Unit,
    readTemplates: XSchemaHandler => Unit,
    release: () => Unit
  ): Schema = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1(readComponent), readSchema = js.Any.fromFunction1(readSchema), readTemplates = js.Any.fromFunction1(readTemplates), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
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
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

