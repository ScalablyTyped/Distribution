package typings.agGrid.contextMod

import typings.agGrid.componentMod.Component
import typings.agGrid.iLoggerMod.ILogger
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/context/context", "Context")
@js.native
class Context protected () extends js.Object {
  def this(params: ContextParams, logger: ILogger) = this()
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
  def createComponent(element: Element): Component = js.native
  def createComponent(element: Element, afterPreCreateCallback: js.Function1[/* comp */ Component, Unit]): Component = js.native
  def destroy(): Unit = js.native
  def getBean(name: String): js.Any = js.native
  /* private */ def getBeanName(constructor: js.Any): js.Any = js.native
  /* private */ def getBeansForParameters(parameters: js.Any, beanName: js.Any): js.Any = js.native
  /* private */ def lookupBeanInstance(wiringBean: js.Any, beanName: js.Any, optional: js.Any): js.Any = js.native
  /* private */ def methodWireBean(bean: js.Any): js.Any = js.native
  /* private */ def methodWireBeans(beans: js.Any): js.Any = js.native
  /* private */ def postConstruct(beans: js.Any): js.Any = js.native
  /* private */ def preConstruct(beans: js.Any): js.Any = js.native
  /* private */ def setupComponents(): js.Any = js.native
  def wireBean(bean: js.Any): Unit = js.native
  def wireBean(bean: js.Any, afterPreCreateCallback: js.Function1[/* comp */ Component, Unit]): Unit = js.native
  /* private */ def wireBeans(beans: js.Any, afterPreCreateCallback: js.Any): js.Any = js.native
}

