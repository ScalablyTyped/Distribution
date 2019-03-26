package typings
package agDashGridLib.distLibContextContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/context/context", "Context")
@js.native
class Context protected () extends js.Object {
  def this(params: ContextParams, logger: agDashGridLib.distLibILoggerMod.ILogger) = this()
  var beans: js.Any = js.native
  var componentsMappedByName: js.Any = js.native
  var contextParams: js.Any = js.native
  var destroyed: js.Any = js.native
  var logger: js.Any = js.native
  /* private */ def addComponent(componentMeta: js.Any): js.Any = js.native
  /* private */ def autoWireBean(bean: js.Any): js.Any = js.native
  /* private */ def autoWireBeans(beans: js.Any): js.Any = js.native
  /* private */ def createBeanEntry(Bean: js.Any): js.Any = js.native
  /* private */ def createBeans(): js.Any = js.native
  def createComponent(element: stdLib.Element): agDashGridLib.distLibWidgetsComponentMod.Component = js.native
  def createComponent(
    element: stdLib.Element,
    afterPreCreateCallback: js.Function1[/* comp */ agDashGridLib.distLibWidgetsComponentMod.Component, scala.Unit]
  ): agDashGridLib.distLibWidgetsComponentMod.Component = js.native
  def destroy(): scala.Unit = js.native
  def getBean(name: java.lang.String): js.Any = js.native
  /* private */ def getBeanName(constructor: js.Any): js.Any = js.native
  /* private */ def getBeansForParameters(parameters: js.Any, beanName: js.Any): js.Any = js.native
  /* private */ def lookupBeanInstance(wiringBean: js.Any, beanName: js.Any): js.Any = js.native
  /* private */ def lookupBeanInstance(wiringBean: js.Any, beanName: js.Any, optional: js.Any): js.Any = js.native
  /* private */ def methodWireBean(bean: js.Any): js.Any = js.native
  /* private */ def methodWireBeans(beans: js.Any): js.Any = js.native
  /* private */ def postConstruct(beans: js.Any): js.Any = js.native
  /* private */ def preConstruct(beans: js.Any): js.Any = js.native
  /* private */ def setupComponents(): js.Any = js.native
  def wireBean(bean: js.Any): scala.Unit = js.native
  def wireBean(
    bean: js.Any,
    afterPreCreateCallback: js.Function1[/* comp */ agDashGridLib.distLibWidgetsComponentMod.Component, scala.Unit]
  ): scala.Unit = js.native
  /* private */ def wireBeans(beans: js.Any): js.Any = js.native
  /* private */ def wireBeans(beans: js.Any, afterPreCreateCallback: js.Any): js.Any = js.native
}

