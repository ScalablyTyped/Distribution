package typings.alloy

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlloyFactories extends js.Object {
  
  /**
    * Factory method for instantiating a Backbone collection of model objects.
    *
    * Creates and returns a collection for holding the named type of model objects.
    *
    * @param name Name of model to hold in this collection.
    * @param args Arguments to pass to the collection.
    */
  def createCollection(name: String): Collection[Model[_, ModelSetOptions, js.Object]] = js.native
  def createCollection(name: String, args: js.Any): Collection[Model[_, ModelSetOptions, js.Object]] = js.native
  
  /**
    * Factory method for instantiating a controller.
    *
    * Creates and returns an instance of the named controller.
    *
    * @param name Name of controller to instantiate.
    * @param args Arguments to pass to the controller
    */
  def createController(name: String): AlloyController = js.native
  def createController(name: String, args: js.Any): AlloyController = js.native
  
  /**
    * Factory method for instantiating a Backbone Model object.
    *
    * Creates and returns an instance of the named model.
    *
    * @param name Name of model to instantiate.
    * @param args Arguments to pass to the model.
    */
  def createModel(name: String): Model[_, ModelSetOptions, js.Object] = js.native
  def createModel(name: String, args: js.Any): Model[_, ModelSetOptions, js.Object] = js.native
  
  /**
    * Factory method for instantiating a widget controller.
    *
    * Creates and returns an instance of the named widget.
    *
    * @param id Id of widget to instantiate.
    * @param name Name of the view within the widget to instantiate ('widget' by default)
    * @param args Arguments to pass to the widget.
    */
  def createWidget(id: String): AlloyController = js.native
  def createWidget(id: String, args: js.Any): AlloyController = js.native
  def createWidget(id: String, name: js.UndefOr[scala.Nothing], args: js.Any): AlloyController = js.native
  def createWidget(id: String, name: String): AlloyController = js.native
  def createWidget(id: String, name: String, args: js.Any): AlloyController = js.native
}
