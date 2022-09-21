package typings.allureJsCommons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("allure-js-commons", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Allure
  
  @JSImport("allure-js-commons", "Attachment")
  @js.native
  open class Attachment protected () extends StObject {
    def this(title: String, source: Any, size: Double, mime: String) = this()
    
    def addAttachment(attachment: Attachment): Unit = js.native
    
    def addStep(step: Step): Unit = js.native
    
    def end(status: Status, error: js.Error): Unit = js.native
    def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
    
    def toXML(): String = js.native
  }
  
  @JSImport("allure-js-commons", "Description")
  @js.native
  open class Description protected () extends StObject {
    def this(value: String, `type`: TYPE) = this()
    
    def toXML(): String = js.native
  }
  
  @JSImport("allure-js-commons", "Step")
  @js.native
  open class Step protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, timestamp: Double) = this()
    
    def addAttachment(attachment: Attachment): Unit = js.native
    
    def addStep(step: Step): Unit = js.native
    
    def end(status: Status, error: js.Error): Unit = js.native
    def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
    
    def toXML(): String = js.native
  }
  
  @JSImport("allure-js-commons", "Suite")
  @js.native
  open class Suite protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, timestamp: Double) = this()
    
    def addTest(test: Test): Boolean = js.native
    
    def end(): Unit = js.native
    def end(timestamp: Double): Unit = js.native
    
    def hasTests(): Boolean = js.native
    
    var name: String = js.native
    
    def toXML(): String = js.native
  }
  
  @js.native
  sealed trait TYPE extends StObject
  @JSImport("allure-js-commons", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TYPE & String] = js.native
    
    @js.native
    sealed trait HTML
      extends StObject
         with TYPE
    /* "html" */ val HTML: typings.allureJsCommons.mod.TYPE.HTML & String = js.native
    
    @js.native
    sealed trait MARKDOWN
      extends StObject
         with TYPE
    /* "markdown" */ val MARKDOWN: typings.allureJsCommons.mod.TYPE.MARKDOWN & String = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with TYPE
    /* "text" */ val TEXT: typings.allureJsCommons.mod.TYPE.TEXT & String = js.native
  }
  
  @JSImport("allure-js-commons", "Test")
  @js.native
  open class Test protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, timestamp: Double) = this()
    
    def addAttachment(attachment: Attachment): Unit = js.native
    
    def addLabel(name: String, value: String): Unit = js.native
    
    def addParameter(kind: Any, name: String, value: String): Unit = js.native
    
    def addStep(step: Step): Unit = js.native
    
    def end(status: Status, error: js.Error): Unit = js.native
    def end(status: Status, error: js.Error, timestamp: Double): Unit = js.native
    
    def setDescription(description: String, `type`: TYPE): Unit = js.native
    
    def toXML(): String = js.native
  }
  
  @js.native
  trait Allure extends StObject {
    
    def addAttachment(attachmentName: String, buffer: Any, `type`: String): Unit = js.native
    
    def endCase(status: Status): Unit = js.native
    def endCase(status: Status, err: js.Object): Unit = js.native
    def endCase(status: Status, err: js.Object, timestamp: Double): Unit = js.native
    def endCase(status: Status, err: Unit, timestamp: Double): Unit = js.native
    
    def endStep(status: Status): Unit = js.native
    def endStep(status: Status, timestamp: Double): Unit = js.native
    
    def endSuite(): Unit = js.native
    def endSuite(timestamp: Double): Unit = js.native
    
    def getCurrentSuite(): Suite = js.native
    
    def getCurrentTest(): Test = js.native
    
    def pendingCase(testName: String): Unit = js.native
    def pendingCase(testName: String, timestamp: Double): Unit = js.native
    
    def setDescription(description: String): Unit = js.native
    def setDescription(description: String, timestamp: Double): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
    
    def startCase(testName: String): Unit = js.native
    def startCase(testName: String, timestamp: Double): Unit = js.native
    
    def startStep(stepName: String): Unit = js.native
    def startStep(stepName: String, timestamp: Double): Unit = js.native
    
    def startSuite(suiteName: String): Unit = js.native
    def startSuite(suiteName: String, timestamp: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var targetDir: String
  }
  object Options {
    
    inline def apply(targetDir: String): Options = {
      val __obj = js.Dynamic.literal(targetDir = targetDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTargetDir(value: String): Self = StObject.set(x, "targetDir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.allureJsCommons.allureJsCommonsStrings.passed
    - typings.allureJsCommons.allureJsCommonsStrings.pending
    - typings.allureJsCommons.allureJsCommonsStrings.skipped
    - typings.allureJsCommons.allureJsCommonsStrings.failed
    - typings.allureJsCommons.allureJsCommonsStrings.broken
  */
  trait Status extends StObject
  object Status {
    
    inline def broken: typings.allureJsCommons.allureJsCommonsStrings.broken = "broken".asInstanceOf[typings.allureJsCommons.allureJsCommonsStrings.broken]
    
    inline def failed: typings.allureJsCommons.allureJsCommonsStrings.failed = "failed".asInstanceOf[typings.allureJsCommons.allureJsCommonsStrings.failed]
    
    inline def passed: typings.allureJsCommons.allureJsCommonsStrings.passed = "passed".asInstanceOf[typings.allureJsCommons.allureJsCommonsStrings.passed]
    
    inline def pending: typings.allureJsCommons.allureJsCommonsStrings.pending = "pending".asInstanceOf[typings.allureJsCommons.allureJsCommonsStrings.pending]
    
    inline def skipped: typings.allureJsCommons.allureJsCommonsStrings.skipped = "skipped".asInstanceOf[typings.allureJsCommons.allureJsCommonsStrings.skipped]
  }
}
