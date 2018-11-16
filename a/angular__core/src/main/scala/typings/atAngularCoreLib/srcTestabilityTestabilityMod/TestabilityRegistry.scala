package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/testability/testability", "TestabilityRegistry")
@js.native
class TestabilityRegistry () extends js.Object {
  /**
       * Find testability of a node in the Tree
       * @param elem node
       * @param findInAncestors whether finding testability in ancestors if testability was not found in
       * current node
       */
  def findTestabilityInTree(elem: stdLib.Node): Testability | scala.Null = js.native
  /**
       * Find testability of a node in the Tree
       * @param elem node
       * @param findInAncestors whether finding testability in ancestors if testability was not found in
       * current node
       */
  def findTestabilityInTree(elem: stdLib.Node, findInAncestors: scala.Boolean): Testability | scala.Null = js.native
  /**
       * Get all registered applications(root elements)
       */
  def getAllRootElements(): js.Array[_] = js.native
  /**
       * Get all registered testabilities
       */
  def getAllTestabilities(): js.Array[Testability] = js.native
  /**
       * Get a testability hook associated with the application
       * @param elem root element
       */
  def getTestability(elem: js.Any): Testability | scala.Null = js.native
  /**
       * Registers an application with a testability hook so that it can be tracked
       * @param token token of application, root element
       * @param testability Testability hook
       */
  def registerApplication(token: js.Any, testability: Testability): scala.Unit = js.native
  /**
       * Unregisters all applications
       */
  def unregisterAllApplications(): scala.Unit = js.native
  /**
       * Unregisters an application.
       * @param token token of application, root element
       */
  def unregisterApplication(token: js.Any): scala.Unit = js.native
}

