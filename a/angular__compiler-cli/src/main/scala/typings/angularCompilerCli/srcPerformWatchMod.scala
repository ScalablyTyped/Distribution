package typings.angularCompilerCli

import typings.angularCompilerCli.anon.FirstCompileResult
import typings.angularCompilerCli.anon.`0`
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.angularCompilerCli.srcTransformersApiMod.TsEmitCallback
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPerformWatchMod {
  
  @JSImport("@angular/compiler-cli/src/perform_watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FileChangeEvent extends StObject
  @JSImport("@angular/compiler-cli/src/perform_watch", "FileChangeEvent")
  @js.native
  object FileChangeEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileChangeEvent & Double] = js.native
    
    @js.native
    sealed trait Change
      extends StObject
         with FileChangeEvent
    /* 0 */ val Change: typings.angularCompilerCli.srcPerformWatchMod.FileChangeEvent.Change & Double = js.native
    
    @js.native
    sealed trait CreateDelete
      extends StObject
         with FileChangeEvent
    /* 1 */ val CreateDelete: typings.angularCompilerCli.srcPerformWatchMod.FileChangeEvent.CreateDelete & Double = js.native
    
    @js.native
    sealed trait CreateDeleteDir
      extends StObject
         with FileChangeEvent
    /* 2 */ val CreateDeleteDir: typings.angularCompilerCli.srcPerformWatchMod.FileChangeEvent.CreateDeleteDir & Double = js.native
  }
  
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit]
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit],
    existingOptions: Unit,
    createEmitCallback: js.Function1[/* options */ CompilerOptions, js.UndefOr[TsEmitCallback]]
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], createEmitCallback.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit],
    existingOptions: typings.typescript.mod.CompilerOptions
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  inline def createPerformWatchHost(
    configFileName: String,
    reportDiagnostics: js.Function1[/* diagnostics */ js.Array[Diagnostic], Unit],
    existingOptions: typings.typescript.mod.CompilerOptions,
    createEmitCallback: js.Function1[/* options */ CompilerOptions, js.UndefOr[TsEmitCallback]]
  ): PerformWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createPerformWatchHost")(configFileName.asInstanceOf[js.Any], reportDiagnostics.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], createEmitCallback.asInstanceOf[js.Any])).asInstanceOf[PerformWatchHost]
  
  inline def performWatchCompilation(host: PerformWatchHost): FirstCompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("performWatchCompilation")(host.asInstanceOf[js.Any]).asInstanceOf[FirstCompileResult]
  
  trait PerformWatchHost extends StObject {
    
    def clearTimeout(timeoutId: Any): Unit
    
    def createCompilerHost(options: CompilerOptions): CompilerHost
    
    def createEmitCallback(options: CompilerOptions): js.UndefOr[TsEmitCallback]
    
    def onFileChange(
      options: CompilerOptions,
      listener: js.Function2[/* event */ FileChangeEvent, /* fileName */ String, Unit],
      ready: js.Function0[Unit]
    ): `0`
    
    def readConfiguration(): ParsedConfiguration
    
    def reportDiagnostics(diagnostics: js.Array[Diagnostic]): Unit
    
    def setTimeout(callback: js.Function0[Unit], ms: Double): Any
  }
  object PerformWatchHost {
    
    inline def apply(
      clearTimeout: Any => Unit,
      createCompilerHost: CompilerOptions => CompilerHost,
      createEmitCallback: CompilerOptions => js.UndefOr[TsEmitCallback],
      onFileChange: (CompilerOptions, js.Function2[/* event */ FileChangeEvent, /* fileName */ String, Unit], js.Function0[Unit]) => `0`,
      readConfiguration: () => ParsedConfiguration,
      reportDiagnostics: js.Array[Diagnostic] => Unit,
      setTimeout: (js.Function0[Unit], Double) => Any
    ): PerformWatchHost = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), createCompilerHost = js.Any.fromFunction1(createCompilerHost), createEmitCallback = js.Any.fromFunction1(createEmitCallback), onFileChange = js.Any.fromFunction3(onFileChange), readConfiguration = js.Any.fromFunction0(readConfiguration), reportDiagnostics = js.Any.fromFunction1(reportDiagnostics), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[PerformWatchHost]
    }
    
    extension [Self <: PerformWatchHost](x: Self) {
      
      inline def setClearTimeout(value: Any => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setCreateCompilerHost(value: CompilerOptions => CompilerHost): Self = StObject.set(x, "createCompilerHost", js.Any.fromFunction1(value))
      
      inline def setCreateEmitCallback(value: CompilerOptions => js.UndefOr[TsEmitCallback]): Self = StObject.set(x, "createEmitCallback", js.Any.fromFunction1(value))
      
      inline def setOnFileChange(
        value: (CompilerOptions, js.Function2[/* event */ FileChangeEvent, /* fileName */ String, Unit], js.Function0[Unit]) => `0`
      ): Self = StObject.set(x, "onFileChange", js.Any.fromFunction3(value))
      
      inline def setReadConfiguration(value: () => ParsedConfiguration): Self = StObject.set(x, "readConfiguration", js.Any.fromFunction0(value))
      
      inline def setReportDiagnostics(value: js.Array[Diagnostic] => Unit): Self = StObject.set(x, "reportDiagnostics", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: (js.Function0[Unit], Double) => Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}
